
package com.apuexpress.apuesta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcApuesta {
    
    public static void InsertApuesta(Apuesta apuesta, Connection conn) {
        String sql = "INSERT INTO Apuesta (idUsuario, idPartido, idEquipo, apuesta) " +
                     "VALUES (?, ?, ?, ?);"; 
    
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, apuesta.getIdUsuario());
            ps.setInt(2, apuesta.getIdPartido());
            ps.setInt(3, apuesta.getIdEquipo());
            ps.setInt(4, apuesta.getApuesta());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }    
    
    public static List<Apuesta> SelectApuestaByEquipo(int idPartido, int idEquipo, Connection conn) {
        String sql = "SELECT * FROM Apuesta " +
                     "WHERE idPartido = ? AND idEquipo = ?;"; 
        
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPartido);
            ps.setInt(2, idEquipo);
            ResultSet rs = ps.executeQuery();
            List<Apuesta> apuestas = new ArrayList<>();
            while(rs.next()) {
                Apuesta thisApuesta = new Apuesta(
                    rs.getInt("idApuesta"),
                    rs.getInt("idUsuario"),
                    rs.getInt("idPartido"),
                    rs.getInt("idEquipo"),
                    rs.getInt("apuesta")
                );
                apuestas.add(thisApuesta);
            }
            rs.close();
            ps.close();
            return apuestas;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    
    public static List<Apuesta> SelectApuestaByPartido(int idPartido, Connection conn) {
        String sql = "SELECT * FROM Apuesta " +
                     "WHERE idPartido;"; 
        
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPartido);
            ResultSet rs = ps.executeQuery();
            List<Apuesta> apuestas = new ArrayList<>();
            while(rs.next()) {
                Apuesta thisApuesta = new Apuesta(
                    rs.getInt("idApuesta"),
                    rs.getInt("idUsuario"),
                    rs.getInt("idPartido"),
                    rs.getInt("idEquipo"),
                    rs.getInt("apuesta")
                );
                apuestas.add(thisApuesta);
            }
            rs.close();
            ps.close();
            return apuestas;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
}
