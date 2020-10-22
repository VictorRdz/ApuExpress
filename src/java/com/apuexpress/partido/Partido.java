
package com.apuexpress.partido;


public class Partido {
    
    int idPartido;
    int idEquipoA;
    int idEquipoB;
    int puntuacionA = 0;
    int puntuacionB = 0;
    double multiplicadorA = 1;
    double multiplicadorB = 1;
    java.sql.Timestamp fechaInicio;
    java.sql.Timestamp fechaFin;
    int tipoResultado = 0;
    int idDeporte;
    
    // Constructor -----------------------
    public Partido(int idPartido, int idEquipoA, int idEquipoB, int puntuacionA, 
            int puntuacionB, double multiplicadorA, double multiplicadorB, 
            java.sql.Timestamp fechaInicio, java.sql.Timestamp fechaFin, int tipoResultado, int idDeporte) {
        
        this.idPartido = idPartido;
        this.idEquipoA = idEquipoA;
        this.idEquipoB = idEquipoB;
        this.puntuacionA = puntuacionA;
        this.puntuacionB = puntuacionB;
        this.multiplicadorA = multiplicadorA;
        this.multiplicadorB = multiplicadorB;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoResultado = tipoResultado;
        this.idDeporte = idDeporte;        
    }
    
    // Methods -----------------------
    public int getId() {
        return this.idPartido;
    }
    
    public int getIdEquipoA() {
        return this.idEquipoA;
    }
    
    public int getIdEquipoB() {
        return this.idEquipoB;
    }
    
    public int getPuntuacionA() {
        return this.puntuacionA;
    }
    
    public int getPuntuacionB() {
        return this.puntuacionB;
    }
    
    public double getMultiplicadorA() {
        return this.multiplicadorA;
    }
    
    public double getMultiplicadorB() {
        return this.multiplicadorB;
    }
    
    public java.sql.Timestamp getFechaInicio() {
        return this.fechaInicio;
    }
    
    public java.sql.Timestamp getFechaFin() {
        return this.fechaFin;
    }
    
    public int getTipoResultado() {
        return this.tipoResultado;
    }
    
    public int getIdDeporte() {
        return this.idDeporte;
    }
}
