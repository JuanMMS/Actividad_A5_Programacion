package org.example.model;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String iD;
    private ArrayList<Vehiculo> listVehiculos;

    public Empresa(String nombre, String iD) {
        this.nombre = nombre;
        this.iD = iD;
        this.listVehiculos = new ArrayList<>();
    }





    //Getters y Setters
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

    public ArrayList<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(ArrayList<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }
}
