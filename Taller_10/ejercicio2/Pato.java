package Taller_10.ejercicio2;

public class Pato implements Nadador, Volador{
    @Override
    public void nadar(){
        System.out.println("\nEl pato esta nadando.");
    }

    @Override
    public void volar(){
        System.out.println("El pato esta volando.");
    }
}
