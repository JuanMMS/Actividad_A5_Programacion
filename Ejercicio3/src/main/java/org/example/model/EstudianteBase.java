package org.example.model;

public class EstudianteBase {
    private String nombre;
    private String correo;
    private Plataforma thePlataforma;


    public EstudianteBase(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    //Getters y Setters

    public Plataforma getThePlataforma() {
        return thePlataforma;
    }

    public void setThePlataforma(Plataforma thePlataforma) {
        this.thePlataforma = thePlataforma;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
