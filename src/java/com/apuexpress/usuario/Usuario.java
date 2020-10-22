
package com.apuexpress.usuario;


public class Usuario {
    
    int idUsuario;
    int tipo = 0;
    String nombre;
    String apellido;
    String correo;
    String contrasena;
    String username;
    int creditos = 0;
    
    // Constructor -----------------------
    public Usuario(int idUsuario, int tipo, String nombre, String apellido,
            String correo, String contrasena, String username, int creditos) {
 
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.username = username;
        this.creditos = creditos;
    }
    
    // Methods -----------------------
    public int getId() {
        return this.idUsuario;
    }
    
    public int getTipo() {
        return this.tipo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getCorreo() {
        return this.correo;
    }
    
    public String getContrasena() {
        return this.contrasena;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public int getCreditos() {
        return this.creditos;
    }
    
    public String getFullName() {
        return this.nombre + " " + this.apellido;
    }
}
