package Taller_8_Super.ejercicio2;

public class Animal {
    public String especie;

    public Animal(String especie){
        this.especie = especie;
    }

    public void mostrarEspecie(){
        System.out.println("\nEspecie: " + especie);
    }
}
