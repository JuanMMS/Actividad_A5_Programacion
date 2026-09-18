package org.example.model;

import java.util.ArrayList;

public final class Configuracion {
    private String idioma;
    private int dificultad;
    private int sonido;
    ArrayList<Jugador> listJugadoresConfig;
    private static Configuracion instance;

    public Configuracion() {
        this.idioma = "Español";
        this.dificultad = 2;
        this.sonido = 10;
        listJugadoresConfig = new ArrayList<>();
    }

    /**
     * Metodo que permite crear una instancia de Configuracion
     * @return intance
     */
    public static Configuracion getInstance() {
        if (instance ==null){
            instance = new Configuracion();
        }
        return instance;
    }


    //Getters y setters

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getSonido() {
        return sonido;
    }

    public void setSonido(int sonido) {
        this.sonido = sonido;
    }

    public ArrayList<Jugador> getListJugadoresConfig() {
        return listJugadoresConfig;
    }

    public void setListJugadoresConfig(ArrayList<Jugador> listJugadoresConfig) {
        this.listJugadoresConfig = listJugadoresConfig;
    }
}
