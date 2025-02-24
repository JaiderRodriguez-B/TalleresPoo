package Taller_8_Herencia.ejercicio3;

public class Empleado{
    public String nombre;
    public int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println("\nNombre: " + nombre + "\nSalario: " + salario);
    }
}