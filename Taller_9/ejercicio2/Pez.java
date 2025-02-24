package Taller_9.ejercicio2;

public class Pez implements Nadador, Respirador {
    
    @Override
    public void nadar(){
        System.out.println("\nEl pez esta nadando.");
    }

    @Override
    public void respirar(){
        System.out.println("El pez esta respirando.");
    }
}
