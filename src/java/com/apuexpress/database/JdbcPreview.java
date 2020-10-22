
package com.apuexpress.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JdbcPreview {
    
    public static List<String> GetPreview(int tipoResultado, int idDeporte, Connection conn) {
        String sql = "SELECT P.idPartido, P.multiplicadorA, P.multiplicadorB, P.fechaInicio, EA.nombre AS nombreA, EB.nombre AS nombreB FROM Partido P " +
                    "INNER JOIN Equipo EA ON EA.idEquipo = P.idEquipoA " +
                    "INNER JOIN Equipo EB ON EB.idEquipo = P.idEquipoB " +
                    "WHERE P.tipoResultado = ? AND P.idDeporte = ?;"; 
        
        List<String> previews = new ArrayList<>();
	try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, tipoResultado);
            ps.setInt(1, idDeporte);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Preview thisPreview = new Preview(
                    rs.getInt("idPartido"),
                    rs.getString("nombreA"),
                    rs.getString("nombreB"),
                    rs.getDouble("multiplicadorA"),
                    rs.getDouble("multiplicadorB"),  
                    rs.getTimestamp("fechaInicio")
                );
                
                String thisHTML = thisPreview.getPartidoHTML();
                previews.add(thisHTML);
            }
            rs.close();
            ps.close();
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
	}
        return previews;
    }
}
