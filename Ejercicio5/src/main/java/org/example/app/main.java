package org.example.app;

import org.example.model.Empresa;
import org.example.model.Tipo;
import org.example.model.Vehiculo;

public class main {
    public static void main(String[] args) {
        //Empresa
        Empresa empresa = new Empresa("Tezlo","123");

        //Vehiculos
        Vehiculo.Builder vehiculo1 = new Vehiculo.Builder()
                .placa("ABC")
                .tipo(Tipo.CARRO)
                .color("Rojo").build();

        Vehiculo.Builder vehiculo2 = new Vehiculo.Builder()
                .placa("DEF")
                .tipo(Tipo.CARRO)
                .color("Azul")
                .capacidad(5).build();

        Vehiculo.Builder vehiculo3 = vehiculo1.clone();

        //Agregar vehiculos
        empresa.agregarVehiculo(vehiculo1);
        empresa.agregarVehiculo(vehiculo2);


    }
}
