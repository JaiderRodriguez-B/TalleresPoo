package Taller_8_Super.ejercicio1;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("\nNombre: "+nombre+"\nEdad: "+edad);
    }
}

