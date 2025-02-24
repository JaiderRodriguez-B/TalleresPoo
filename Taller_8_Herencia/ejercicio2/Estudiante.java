package Taller_8_Herencia.ejercicio2;

public class Estudiante extends Persona {
    public String matricula;

    public Estudiante(String matricula, String nombre, int edad){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Matricula: "+matricula);
    }
}
