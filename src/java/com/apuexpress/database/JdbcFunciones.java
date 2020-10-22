
package com.apuexpress.database;

import com.apuexpress.apuesta.Apuesta;
import com.apuexpress.apuesta.JdbcApuesta;
import com.apuexpress.partido.JdbcPartido;
import com.apuexpress.partido.Partido;
import com.apuexpress.usuario.JdbcUsuario;
import java.util.List;



public class JdbcFunciones {
    
    /*public static void DefinirPartido(int idPartido, int puntuacionA, 
            int puntuacionB, int tipoResultado) {
        
        // Update tipo, marcadores and get this partido data.
        JdbcPartido.UpdatePartido(idPartido, puntuacionA, puntuacionB, tipoResultado);
        Partido thisPartido = JdbcPartido.SelectPartidoById(idPartido);
        
        switch(tipoResultado) {      
            case 1: // Partido finalizado con un ganador.
                // Get equipo ganador.
                int idEquipo = 0;
                double multiplicador = 1;
                if(puntuacionA > puntuacionB) {
                    idEquipo = thisPartido.getIdEquipoA();
                    multiplicador = thisPartido.getMultiplicadorA();
                }
                else if(puntuacionB < puntuacionA) {
                    idEquipo = thisPartido.getIdEquipoB();
                    multiplicador = thisPartido.getMultiplicadorB();
                }
                // Get usuarios ganadores and assign creditos to every winner usuario
                List<Apuesta> UsuariosGanadores = JdbcApuesta.SelectApuestaByEquipo(idPartido, idEquipo);
                for (Apuesta thisApuesta : UsuariosGanadores) {
                    int idUsuario = thisApuesta.getIdUsuario();
                    int apuesta = thisApuesta.getApuesta();
                    int creditos = (int)((double) apuesta * multiplicador);
                    JdbcUsuario.UpdateCreditosUsuario(idUsuario, creditos);
                } 
                break;
            
                
            case 2: // Partido cancelado o empate.
                // Get all usuarios and devolver sus creditos.
                List<Apuesta> AllUsuarios = JdbcApuesta.SelectApuestaByPartido(idPartido);
                for(Apuesta thisApuesta : AllUsuarios) {
                    int idUsuario = thisApuesta.getIdUsuario();
                    int creditos = thisApuesta.getApuesta();
                    JdbcUsuario.UpdateCreditosUsuario(idUsuario, creditos);
                }
                break;
        }
    }*/
    
}
