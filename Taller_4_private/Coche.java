package Taller_4_private;

public class Coche {

    private String marca, modelo;
    private double velocidad;

    public String getModelo(){
        return modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }
}