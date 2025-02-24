package Taller_8_Herencia.Ejercicio1;

public class Vehiculo {
    public String marca;
    public double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima2){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima2;
    }

    public void mostrarInfo(){
        System.out.println("\nMarca: "+marca+"\nVelocidad maxima: "+velocidadMaxima);
    }
}
