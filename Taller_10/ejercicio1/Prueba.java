package Taller_10.ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2, 5);
        Rectangulo rectangulo = new Rectangulo(5, 3);

        double areaT = triangulo.calcularArea_();
        double areaR = rectangulo.calcularArea_();
        System.out.println("\nArea del triangulo: "+areaT + "\nArea de rectangulo: "+ areaR);
    }
}