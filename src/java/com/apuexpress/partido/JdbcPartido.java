
package com.apuexpress.partido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPartido {
        
    
    public static void InsertPartido(Partido partido, Connection conn) {
        String sql = "INSERT INTO Partido (idEquipoA, idEquipoB, puntuacionA, "
                +   "puntuacionB, multiplicadorA, multiplicadorB, fechaInicio, "
                +   "fechaFin, tipoResultado, idDeporte) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"; 
	
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, partido.getIdEquipoA());
            ps.setInt(2, partido.getIdEquipoB());
            ps.setInt(3, partido.getPuntuacionA());
            ps.setInt(4, partido.getPuntuacionB());
            ps.setDouble(5, partido.getMultiplicadorA());
            ps.setDouble(6, partido.getMultiplicadorB());
            ps.setTimestamp(7, partido.getFechaInicio());
            ps.setTimestamp(8, partido.getFechaFin());
            ps.setInt(9, partido.getTipoResultado());
            ps.setInt(10, partido.getIdDeporte());
            ps.executeUpdate();
            ps.close();	
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    

    public static void UpdatePartido(int idPartido, int puntuacionA, 
            int puntuacionB, int tipoResultado, Connection conn) {
        
        String sql = "UPDATE Partido SET puntuacionA = ?, puntuacionB = ?, "
                +   "tipoResultado = ? WHERE idPartido = ?;"; 
    
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, puntuacionA);
            ps.setInt(2, puntuacionB);
            ps.setInt(3, tipoResultado);
            ps.setInt(4, idPartido);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    
    public static Partido SelectPartidoById(int idPartido, Connection conn) {
        String sql = "SELECT * FROM Partido" +
                     "WHERE idPartido = ?;"; 
        
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPartido);
            ResultSet rs = ps.executeQuery();
            Partido thisPartido = null;
            if(rs.next()) {
                thisPartido = new Partido(
                    rs.getInt("idPartido"),
                    rs.getInt("idEquipoA"),
                    rs.getInt("idEquipoB"),
                    rs.getInt("puntuacionA"),
                    rs.getInt("puntuacionB"),
                    rs.getDouble("multiplicadorA"),
                    rs.getDouble("multiplicadorB"),
                    rs.getTimestamp("fechaInicio"),
                    rs.getTimestamp("fechaFin"),
                    rs.getInt("tipoResultado"),
                    rs.getInt("idDeporte")
                );
            }
            rs.close();
            ps.close();
            return thisPartido;

        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    
    
    public static String GetOptionPartidos(Connection conn) {
        String sql = "SELECT P.idPartido, EA.nombre AS nombreA, EB.nombre AS nombreB " +
                        "FROM Partido P " +
                        "INNER JOIN Equipo EA ON EA.idEquipo = P.idEquipoA " +
                        "INNER JOIN Equipo EB ON EB.idEquipo = P.idEquipoB " +
                        "WHERE P.tipoResultado = 0;"; 
        String options = "";
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                int idPartido = rs.getInt("idPartido");
                String nombreA = rs.getString("nombreA");
                String nombreB = rs.getString("nombreB");

                String thisOption = "<option value='" + idPartido + "'>" + nombreA + " vs " + nombreB + "</option>";
                options += thisOption;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("ERROR on GetOptionPartidos");
	}
        return options;
    }
    
}
