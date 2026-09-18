package org.example.app;

import org.example.model.Estudiante;
import org.example.model.Plataforma;

import java.net.StandardSocketOptions;

public class main {
    public static void main(String[] args) {
        //Plataforma
        Plataforma plataforma = new Plataforma("EducaTive", "123");

        //Estudiantes
        Estudiante.EstudianteBuilder estudiante1 = new Estudiante.EstudianteBuilder()
                .nombre("Juan")
                .correo("juan@hola.com")
                .direccion("Armenia");


        Estudiante.EstudianteBuilder estudiante2 = new Estudiante.EstudianteBuilder()
                .nombre("Cam")
                .correo("cam@hola.com")
                .telefono("32122")
                .direccion("Pereira");

        Estudiante.EstudianteBuilder estudiante3 = new Estudiante.EstudianteBuilder()
                .nombre("Pablo")
                .correo("pablo@hola.com")
                .direccion("Armenia")
                .intereses("Hockey");

        //Agregar estudiantes a la plataforma
        plataforma.agregarEstudiante(estudiante1);
        plataforma.agregarEstudiante(estudiante2);
        plataforma.agregarEstudiante(estudiante3);

        System.out.println(estudiante1.toString());
        System.out.println(plataforma.toString());
    }

}



