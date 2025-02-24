package Taller_6;

public class Prueba {
    public static void main(String[] args) {
        Coche coche1 = new Coche(null, null);
        Coche coche2 = new Coche(null, null);
        Coche coche3 = new Coche(null, null);
        coche1.Marca = "Mazda";
        coche2.Modelo = "2012";
        coche3.Marca = "Auidi";

        Coche.MostrarCantidadCoches();

        Matematicas.Suma(2, 2);
        Matematicas.Resta(2, 7);
        Matematicas.Multiplicacion(7, 8);
        Matematicas.Division(16, 4);
    }
}
