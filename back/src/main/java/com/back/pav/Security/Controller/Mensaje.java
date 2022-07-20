
package com.back.pav.Security.Controller;


public class Mensaje {
    private String mensaje; 
//constructores
    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Mensaje() {
    }
    
    //getter & setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
