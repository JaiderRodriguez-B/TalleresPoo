package Taller_8_Herencia.Ejercicio1;

public class Coche extends Vehiculo {
    public int numeroPuertas;

    public Coche(String marca, double velocidadMaxima, int numeroPuertas){
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de puertas: "+ numeroPuertas);
    }
}
