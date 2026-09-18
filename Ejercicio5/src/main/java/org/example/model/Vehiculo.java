package org.example.model;

import java.io.Serializable;

public class Vehiculo implements Cloneable{
    private String placa;
    private String color;
    private int capacidad;
    private Tipo tipo;


    public static class VehiculoBuilder{
        private String placa;
        private String color;
        private int capacidad;
        private Tipo tipo;

        /**
         * Metodo para crear vehiculo con vehiculo builder
         * @param placa
         * @return
         */
        public VehiculoBuilder placa(String placa) {
            this.placa = placa;
            return this;
        }
        public VehiculoBuilder color(String color) {
            this.color = color;
            return this;
        }
        public VehiculoBuilder capacidad(int capacidad) {
            this.capacidad = capacidad;
            return this;
        }
        public VehiculoBuilder tipo(Tipo tipo) {
            this.tipo = tipo;
            return this;
        }
        public VehiculoBuilder build(){
            return new VehiculoBuilder();
        }
    }

    /**
     * MEtodo para clonar metodo vehiculo
     * @return
     * @throws CloneNotSupportedException
     */
    public VehiculoBuilder clonar() throws CloneNotSupportedException {
        return (VehiculoBuilder) super.clone();
    }










    //Getters y Setters

    public String getPlaca() {return placa;}

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
