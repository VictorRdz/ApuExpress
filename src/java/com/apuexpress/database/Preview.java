
package com.apuexpress.database;


public class Preview {
    int idPartido;
    String nombreA;
    String nombreB;
    double multiplicadorA;
    double multiplicadorB;
    java.sql.Timestamp fechaInicio;
    
    
    public Preview(int idPartido, String nombreA, String nombreB, 
            double multiplicadorA, double multiplicadorB, java.sql.Timestamp fechaInicio) {
        
        this.idPartido = idPartido;
        this.nombreA = nombreA;
        this.nombreB = nombreB;
        this.multiplicadorA = multiplicadorA;
        this.multiplicadorB = multiplicadorB;
        this.fechaInicio = fechaInicio;
    }
    
    
    public String getPartidoHTML() {
        return "<div class='container'>" +
            "<div class='overlay'>" +
                "<div class='match-header'>" +
                    "<span class='match-league'></span>" +
                    "<span class='match-date'>" + this.fechaInicio.toString() + "</span>" +
                "</div>" +
                "<div class='match'>" +
                    "<div class='visible-info'>" +
                        "<div class='team-info'>" +
                            "<span class='team-one-name'>" + this.nombreA + "</span>" +
                            "<br>" +
                            "<span class='team-one-multiplier'>x" + this.multiplicadorA + "</span>" +
                        "</div>" +
                        "<div>" +
                            "<img src='images/equipos/" + this.nombreA + ".png' class='team-one-image'>" +
                        "</div>" +
                    "</div>" +
                    "<b>VS</b>" +
                    "<div class='visible-info'>" +
                        "<div>" +
                            "<img src='images/equipos/" + this.nombreB + ".png' class='team-two-image'>" +
                        "</div>" +
                        "<div class='team-info'>" +
                            "<span class='team-two-name'>" + this.nombreB + "</span>" +
                            "<br>" +
                            "<span class='team-two-multiplier'>x" + this.multiplicadorB + "</span>" +
                        "</div>" +
                    "</div>" +                                
                "</div>" +                            
            "</div>" +
        "</div>";
    }
}
