package org.example.model;

public class Jugador {
    private String nombre;
    private String iD;
    private int nivel;
    private Configuracion theConfiguracionJugador;

    public Jugador(String nombre, String iD, int nivel, Configuracion theConfiguracionJugador) {
        this.nombre = nombre;
        this.iD = iD;
        this.nivel = nivel;
        this.theConfiguracionJugador = theConfiguracionJugador;

    }






    //Getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Configuracion getTheConfiguracionJugador() {
        return theConfiguracionJugador;
    }

    public void setTheConfiguracionJugador(Configuracion theConfiguracionJugador) {
        this.theConfiguracionJugador = theConfiguracionJugador;
    }
}
