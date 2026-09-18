package org.example.model;

import java.util.ArrayList;

public class Plataforma {
    private String nombre;
    private String iD;
    private ArrayList<Estudiante.EstudianteBuilder> listEstudiantes;

    public Plataforma(String nombre, String iD) {
        this.nombre = nombre;
        this.iD = iD;
        this.listEstudiantes = new ArrayList<>();
    }

    /**
     * Metodo para agregar estudiante a plataforma
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante.EstudianteBuilder estudiante){listEstudiantes.add(estudiante);}



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

    public ArrayList<Estudiante.EstudianteBuilder> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(ArrayList<Estudiante.EstudianteBuilder> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }


    @Override
    public String toString() {
        return "Plataforma{" +
                "nombre='" + nombre + '\'' +
                ", iD='" + iD + '\'' +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}
