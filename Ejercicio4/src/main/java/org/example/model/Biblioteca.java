package org.example.model;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String iD;
    private ArrayList<Usuario> listUsuarios;
    private ArrayList<Libro> listLibros;

    public Biblioteca(String nombre, String iD) {
        this.nombre = nombre;
        this.iD = iD;
        this.listUsuarios = new ArrayList<>();
        this.listLibros = new ArrayList<>();
    }

}
