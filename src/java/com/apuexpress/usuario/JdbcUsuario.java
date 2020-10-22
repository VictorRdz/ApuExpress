
package com.apuexpress.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUsuario {
    
    
    public static void InsertUsuario(Usuario usuario, Connection conn) {
        String sql = "INSERT INTO Usuario (tipo, nombre, apellido, correo, "
                + "contrasena, username, creditos) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?);"; 
    
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, usuario.getTipo());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getCorreo());
            ps.setString(5, usuario.getContrasena());
            ps.setString(6, usuario.getUsername());
            ps.setInt(7, usuario.getCreditos());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    

    public static Usuario SelectUsuarioById(int idUsuario, Connection conn) {
        String sql = "SELECT * FROM Usuario " +
                     "WHERE idUsuario = ?;"; 
        
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            Usuario thisUsuario = null;
            if(rs.next()) {
                thisUsuario = new Usuario(
                    rs.getInt("idUsuario"),
                    rs.getInt("tipo"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("correo"),
                    rs.getString("contrasena"),
                    rs.getString("username"),
                    rs.getInt("creditos")
                );
            }
            rs.close();
            ps.close();
            return thisUsuario;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    

    public static void UpdateCreditosUsuario(int idUsuario, int creditos, Connection conn) {
        String sql = "UPDATE Usuario SET creditos += ? "
                +    "WHERE idUsuario = ?"; 
    
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, creditos);
            ps.setInt(2, idUsuario);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
    }
    

    public static Usuario CheckIfUsuarioExists(String username, String contrasena, Connection conn) {
        String sql = "SELECT * FROM Usuario " +
                     "WHERE ((username = ? || correo = ?) "
                +       "AND (contrasena = ?));"; 
        
        Usuario thisUsuario = null;
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, username);
            ps.setString(3, contrasena);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {                    
                thisUsuario = new Usuario(
                    rs.getInt("idUsuario"),
                    rs.getInt("tipo"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("correo"),
                    rs.getString("contrasena"),
                    rs.getString("username"),
                    rs.getInt("creditos")
                );
            }
            rs.close();
            ps.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
        return thisUsuario;
    }
}
