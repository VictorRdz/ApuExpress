
package com.apuexpress.equipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEquipo {
    
    
    public static void InsertarEquipo(Equipo equipo, Connection conn) {
        String sql = "INSERT INTO Equipo (nombre, pais, idDeporte) " +
                     "VALUES (?, ?, ?);"; 
	
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, equipo.getNombre());
            ps.setString(2, equipo.getPais());
            ps.setInt(3, equipo.getIdDeporte());
            ps.executeUpdate();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
	}
        
    }
    

    public static Equipo SelectEquipoById(int idEquipo, Connection conn) {
        String sql = "SELECT * FROM Equipo " +
                     "WHERE idEquipo = ?;"; 
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            ResultSet rs = ps.executeQuery();
            Equipo thisEquipo = null;
            if(rs.next()) {
                thisEquipo = new Equipo(
                    rs.getInt("idEquipo"),
                    rs.getString("nombre"),
                    rs.getString("pais"),
                    rs.getInt("idDeporte")
                );
            }
            rs.close();
            ps.close();
            return thisEquipo;
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
	
    }
    

    public static String getEquipoOptions(int idDeporte, Connection conn) {
        String sql = "SELECT * FROM Equipo " +
                     "WHERE idDeporte = ?;"; 
	
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idDeporte);
            ResultSet rs = ps.executeQuery();
            String options = "";
            while(rs.next()) {
                int idEquipo = rs.getInt("idEquipo");
                String nombre = rs.getString("nombre");
                String thisOption = "<option value='" + idEquipo + "'>" +
                        nombre + "</option>";
                options += thisOption;
            }
            rs.close();
            ps.close();
            return options;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
}
