package Taller_10.ejercicio1;

public class Rectangulo extends Figura{
    
    int base, altura;

    public Rectangulo(int base,int altura ){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calcularArea_(){
        return base*altura;
    }
}
