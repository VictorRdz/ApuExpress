
package com.apuexpress.controller;

import com.apuexpress.equipo.Equipo;
import com.apuexpress.equipo.JdbcEquipo;
import com.apuexpress.partido.JdbcPartido;
import com.apuexpress.partido.Partido;
import java.sql.Connection;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class adminController {
    @Autowired
    private DataSource dataSource;
    
    
    @RequestMapping("/admin.htm")
    public ModelAndView admin() {
        ModelAndView model = new ModelAndView("admin");
        
        Connection conn = null;
        String equiposSoccer = "";
        String equiposAmericano = "";
        String boxeadores = "";
        String partidosADefinir = "";
        try {
            conn = dataSource.getConnection();
            
            
            equiposSoccer = JdbcEquipo.getEquipoOptions(1, conn);
            equiposAmericano = JdbcEquipo.getEquipoOptions(2, conn);
            boxeadores = JdbcEquipo.getEquipoOptions(3, conn);
            partidosADefinir = JdbcPartido.GetOptionPartidos(conn);
            
            
            conn.close();
        } catch(Exception e) {
            System.out.println("Error al crear la conexión.");
        }

        model.addObject("equiposSoccer", equiposSoccer);
        model.addObject("equiposAmericano", equiposAmericano);
        model.addObject("boxeadores", boxeadores);
        model.addObject("partidosADefinir", partidosADefinir);
        
        return model;
    }
    
    
    @RequestMapping(value="/crear_equipo.htm", method = RequestMethod.POST)
    public String crearEquipo(@RequestParam("nombre") String nombre, 
            @RequestParam("pais") String pais, 
            @RequestParam("idDeporte") int idDeporte ) {
        
        
        Equipo thisEquipo = new Equipo(0, nombre, pais, idDeporte);
        
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            JdbcEquipo.InsertarEquipo(thisEquipo, conn);
            conn.close();
        } catch(Exception e) {
            System.out.println("Error al crear la conexión.");
        }
        
        return "redirect:/admin.htm";  
    }
    
    
    @RequestMapping(value="/crear_partido.htm", method = RequestMethod.POST)
    public String crearPartido(@RequestParam("idEquipoA") int idEquipoA, 
            @RequestParam("idEquipoB") int idEquipoB, 
            @RequestParam("multiplicadorA") double multiplicadorA, 
            @RequestParam("multiplicadorB") double multiplicadorB,
            @RequestParam("fecha") String fecha, 
            @RequestParam("horaInicio") String horaInicio, 
            @RequestParam("horaFin") String horaFin,
            @RequestParam("idDeporte") int idDeporte) {
        
            String[] thisFecha = fecha.split("/");
            int ano = Integer.parseInt(thisFecha[0]) - 1900;
            int mes = Integer.parseInt(thisFecha[1]) - 1;
            int dia = Integer.parseInt(thisFecha[2]);
            
            String[] thisHoraInicio = horaInicio.split(":");
            int horaI = Integer.parseInt(thisHoraInicio[0]);
            int minutosI = Integer.parseInt(thisHoraInicio[1]);
            int segundosI = Integer.parseInt(thisHoraInicio[2]);
            
            String[] thisHoraFin = horaFin.split(":");
            int horaF = Integer.parseInt(thisHoraFin[0]);
            int minutosF = Integer.parseInt(thisHoraFin[1]);
            int segundosF = Integer.parseInt(thisHoraFin[2]);
                        
            java.sql.Timestamp fechaInicio = new java.sql.Timestamp(ano, mes, dia, horaI, minutosI, segundosI, 0);
            java.sql.Timestamp fechaFin = new java.sql.Timestamp(ano, mes, dia, horaF, minutosF, segundosF, 0);

            Partido thisPartido = new Partido(0, idEquipoA, idEquipoB, 0, 
            0, multiplicadorA, multiplicadorB, fechaInicio, fechaFin, 0, idDeporte);
        
            Connection conn = null;
            try {
                conn = dataSource.getConnection();
                JdbcPartido.InsertPartido(thisPartido, conn);
                conn.close();
            } catch(Exception e) {
                System.out.println("Error al crear la conexión.");
            }
        
        return "redirect:/admin.htm";  
    }
    
}
