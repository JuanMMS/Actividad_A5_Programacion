package org.example.model;

public class Estudiante extends EstudianteBase{
    private String telefono;
    private String direccion;
    private String intereses;

    public Estudiante(String nombre, String correo, String telefono, String direccion, String intereses) {
        super(nombre, correo);
        this.telefono = telefono;
        this.direccion = direccion;
        this.intereses = intereses;
    }

     public static class EstudianteBuilder{
        private String nombre;
        private String correo;
        private String telefono;
        private String direccion;
        private String intereses;
        public EstudianteBuilder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        public EstudianteBuilder correo(String correo){
            this.correo = correo;
            return this;
        }
        public EstudianteBuilder telefono(String telefono){
            this.telefono = telefono;
            return this;
        }
        public EstudianteBuilder direccion(String direccion){
            this.direccion = direccion;
            return this;
        }
        public EstudianteBuilder intereses(String intereses){
            this.intereses = intereses;
            return this;
        }
        public EstudianteBuilder build(){
            return new EstudianteBuilder();
        }

         @Override
         public String toString() {
             return "EstudianteBuilder{" +
                     "nombre='" + nombre + '\'' +
                     ", correo='" + correo + '\'' +
                     ", telefono='" + telefono + '\'' +
                     ", direccion='" + direccion + '\'' +
                     ", intereses='" + intereses + '\'' +
                     '}';
         }
     }

}
