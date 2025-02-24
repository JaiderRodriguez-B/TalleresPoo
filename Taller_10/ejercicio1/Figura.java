package Taller_10.ejercicio1;

public abstract class Figura {

    public abstract int calcularArea_();

    public void mostrarArea(){
        System.out.println("El Area de la figura es: " + calcularArea_());
    }
}

