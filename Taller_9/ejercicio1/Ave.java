package Taller_9.ejercicio1;

public class Ave implements Volador, Cantante {
    
    @Override
    public void volar(){
        System.out.println("\nEl ave esta volando.");
    }

    @Override
    public void cantar(){
        System.out.println("El ave esta cantando.");
    }
}
