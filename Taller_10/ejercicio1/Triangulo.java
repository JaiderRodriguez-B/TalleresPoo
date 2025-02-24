package Taller_10.ejercicio1;


public class Triangulo extends Figura{
    int base, altura;

    public Triangulo(int base, int altura ){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calcularArea_(){
        return (base*altura)/2;
    }
}
