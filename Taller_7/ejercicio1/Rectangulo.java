package Taller_7.ejercicio1;

public class Rectangulo extends Figura{
    
    double base, altura;

    public Rectangulo(double base, double altura ){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }

}
