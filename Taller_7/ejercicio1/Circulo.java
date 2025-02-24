package Taller_7.ejercicio1;

public class Circulo extends Figura {
    
    public double pi, radio;

    public Circulo(double pi, double radio){
        this.pi = pi;
        this.radio = radio; 
    }

    @Override
    public double calcularArea(){
        return pi*(radio*radio);
    }

}
