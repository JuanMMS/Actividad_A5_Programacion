package org.example.model;

import java.util.ArrayList;

public class Juego {
    private String nombre;
    private String iD;
    private ArrayList<Jugador> listJugadores;
    private Configuracion theConfiguracion;


    public Juego(String nombre, String iD, Configuracion theConfiguracion) {
        this.nombre = nombre;
        this.iD = iD;
        listJugadores = new ArrayList<>();
        this.theConfiguracion = theConfiguracion;
    }

    /**
     * Metodo para agregar jugadores al juego
     * @param jugador
     */
    public void agregarJugador(Jugador jugador){
        listJugadores.add(jugador);
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

    public ArrayList<Jugador> getListJugadores() {
        return listJugadores;
    }

    public void setListJugadores(ArrayList<Jugador> listJugadores) {
        this.listJugadores = listJugadores;
    }

    public Configuracion getTheConfiguracion() {
        return theConfiguracion;
    }

    public void setTheConfiguracion(Configuracion theConfiguracion) {
        this.theConfiguracion = theConfiguracion;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", iD='" + iD + '\'' +
                ", listJugadores=" + listJugadores +
                ", theConfiguracion=" + theConfiguracion +
                '}';
    }
}
