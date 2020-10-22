
package com.apuexpress.apuesta;


public class Apuesta {
            
    int idApuesta;
    int idUsuario;
    int idPartido;
    int idEquipo;
    int apuesta = 0;
    
    // Constructor -----------------------
    public Apuesta(int idApuesta, int idUsuario, int idPartido,
            int idEquipo, int apuesta) {
        
        this.idApuesta = idApuesta;
        this.idUsuario = idUsuario;
        this.idPartido = idPartido;
        this.idEquipo = idEquipo;
        this.apuesta = apuesta;
    }
    
    // Methods -----------------------
    public int getId() {
        return this.idApuesta;
    }
    
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public int getIdPartido() {
        return this.idPartido;
    }
    
    public int getIdEquipo() {
        return this.idEquipo;
    }
    
    public int getApuesta() {
        return this.apuesta;
    }
}
