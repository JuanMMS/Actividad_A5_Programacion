package org.example.model;

import java.io.Serializable;

public class Vehiculo implements Cloneable{
    private String placa;
    private String color;
    private int capacidad;
    private Tipo tipo;

    public Vehiculo(String placa, String color, int capacidad, Tipo tipo) {
        this.placa = placa;
        this.color = color;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }


    public static class Builder{
        private String placa;
        private String color;
        private int capacidad;
        private Tipo tipo;

        /**
         * Metodo para crear vehiculo con vehiculo builder
         * @param placa
         * @return
         */
        public Builder placa(String placa) {
            this.placa = placa;
            return this;
        }
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        public Builder capacidad(int capacidad) {
            this.capacidad = capacidad;
            return this;
        }
        public Builder tipo(Tipo tipo) {
            this.tipo = tipo;
            return this;
        }
        public Builder build(){
            return new Builder(this);
        }
    }

    /**
     * MEtodo para clonar metodo vehiculo
     * @return
     * @throws CloneNotSupportedException
     */
    public Vehiculo.Builder clonar() throws CloneNotSupportedException {
        return (Builder) super.clone();
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
