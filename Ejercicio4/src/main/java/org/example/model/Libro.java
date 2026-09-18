package org.example.model;

public class Libro implements Cloneable {
    private String titulo;
    private String iD;
    private String autor;
    private String anotaciones;
    private String marcadores;
    private Usuario usuario;

    public Libro (String titulo, String iD, String autor, String anotaciones, String marcadores, Usuario usuario) {
        this.titulo = titulo;
        this.iD = iD;
        this.autor = autor;
        this.anotaciones = anotaciones;
        this.marcadores = marcadores;
        this.usuario = usuario;
    }


    /**
     * Metodo que permite clonar una clase de tipo Libro
     * @return Libro
     * @throws CloneNotSupportedException
     */
    public Libro clonar() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }



    //Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getMarcadores() {
        return marcadores;
    }

    public void setMarcadores(String marcadores) {
        this.marcadores = marcadores;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

