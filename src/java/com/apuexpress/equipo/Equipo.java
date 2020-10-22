
package com.apuexpress.equipo;


public class Equipo {
    int idEquipo;
    String nombre;
    String pais;
    int idDeporte;
    
    // Constructor ----------------------------------
    public Equipo(int idEquipo, String nombre, String pais, int idDeporte) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.pais = pais;
        this.idDeporte = idDeporte;
    }
    
    // Methods ----------------------------------
    public String[] getData() {
        String[] data = {
            String.valueOf(this.idEquipo),
            this.nombre,
            this.pais,
            String.valueOf(this.idDeporte)
        };
        return data;
    }
    
    public int getId() {
        return this.idEquipo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getPais() {
        return this.pais;
    }
    
    public int getIdDeporte() {
        return this.idDeporte;
    }
}
