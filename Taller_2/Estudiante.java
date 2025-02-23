package Taller_2;

public class Estudiante {
    public String nombre;
    public int edad ;
    
    public Estudiante(){
        this("Sin nombre", 0);
    }
    
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarEstudiante(){
        System.out.println("\nNombre: "+ this.nombre + ", Edad: "+ this.edad );
    }

}