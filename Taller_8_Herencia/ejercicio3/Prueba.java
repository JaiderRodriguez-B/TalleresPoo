package Taller_8_Herencia.ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Fulano", 500000);
        Gerente gerente1 = new Gerente("jaider", 1000000, "Programador");
        gerente1.mostrarDetalles();
        empleado1.mostrarDetalles();
    }
}
