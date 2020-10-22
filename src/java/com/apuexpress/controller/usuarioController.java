
package com.apuexpress.controller;

import com.apuexpress.usuario.JdbcUsuario;
import com.apuexpress.usuario.Usuario;
import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class usuarioController {
    @Autowired
    private DataSource dataSource;
    
    @RequestMapping(value="/crear_usuario.htm", method = RequestMethod.POST)
    public String crearUsuario(@RequestParam("nombre") String nombre, 
            @RequestParam("apellido") String apellido, 
            @RequestParam("username") String username,
            @RequestParam("correo") String correo,
            @RequestParam("contrasena") String contrasena) {
        
        Usuario thisUsuario = new Usuario(0, 0, nombre, apellido,
            correo, contrasena, username, 0);
        
        Connection conn = null;
            try {
                conn = dataSource.getConnection();
                JdbcUsuario.InsertUsuario(thisUsuario, conn);
                conn.close();
            } catch(Exception e) {
                System.out.println("Error al crear la conexión.");
            }
        
        return "redirect:/index.htm";  
    }
    
    
    @RequestMapping(value="/iniciar_sesion.htm", method = RequestMethod.POST)
    public ModelAndView iniciarSesion(@RequestParam("username") String username, 
            @RequestParam("contrasena") String contrasena) {
        
        ModelAndView model = new ModelAndView("index");
        
        Connection conn = null;
            try {
                conn = dataSource.getConnection();
                Usuario thisUsuario = JdbcUsuario.CheckIfUsuarioExists(username, contrasena, conn);
                                
                model.addObject("creditos", thisUsuario.getCreditos());
                model.addObject("username", thisUsuario.getUsername());
                model.addObject("contrasena", thisUsuario.getContrasena());
                model.addObject("correo", thisUsuario.getCorreo());
                model.addObject("apellido", thisUsuario.getApellido());
                model.addObject("nombre", thisUsuario.getNombre());
                model.addObject("tipo", thisUsuario.getTipo());
                model.addObject("idUsuario", thisUsuario.getId());
                conn.close();
            } catch(Exception e) {
                System.out.println("Error al crear la conexión.");
            }
        
        return model;  
    }
}
