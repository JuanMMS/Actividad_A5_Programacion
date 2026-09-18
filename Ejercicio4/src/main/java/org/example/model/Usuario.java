package org.example.model;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String iD;
    private ArrayList<Libro> listLibrosUsuarios;

    public Usuario(String nombre, String iD) {
        this.nombre = nombre;
        this.iD = iD;
        this.listLibrosUsuarios = new ArrayList<>();
    }
}
