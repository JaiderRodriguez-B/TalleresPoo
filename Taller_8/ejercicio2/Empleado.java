package TallerSiete.ejercicio2;

public abstract class Empleado{
    String nombre;

    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println("\nNombre: " + nombre + "\nSalario: " + calcularSalario());
    }
}