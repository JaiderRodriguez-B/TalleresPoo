package TallerDos;

public class Estudiante {
    public static String nombre;
    public static int edad ;
    
    public Estudiante(){
        this(nombre, edad);
    }
    
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarEstudiante(){
        System.out.println("\nNombre: "+ this.nombre + ", Edad: "+ this.edad );
    }

}