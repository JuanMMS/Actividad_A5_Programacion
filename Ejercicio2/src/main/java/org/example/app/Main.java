package org.example.app;

import org.example.model.Configuracion;
import org.example.model.Juego;
import org.example.model.Jugador;

public class Main {
    public static void main(String[] args) {

        //Configuracion
        Configuracion configuracion = Configuracion.getInstance();
        //Juego
        Juego juego = new Juego("Carlos duty", "123", configuracion);
        //Jugadores
        Jugador jugador1 = new Jugador("Juan", "1", 1, configuracion);
        Jugador jugador2 = new Jugador("Cam", "2", 2, configuracion);
        Jugador jugador3 = new Jugador("Esteban", "3", 1, configuracion);



        //agregar jugadores
        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);
        juego.agregarJugador(jugador3);

        System.out.println(juego.toString());
    }


}
