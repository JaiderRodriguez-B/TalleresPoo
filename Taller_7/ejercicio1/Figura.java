package Taller_7.ejercicio1;

public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea(){
        System.out.println("El Area de la figura es: " + calcularArea());
    }
}
