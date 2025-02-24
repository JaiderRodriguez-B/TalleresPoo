package Taller_8_Herencia.ejercicio2;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("\nNombre: "+nombre+"\nEdad: "+edad);
    }
}
