package Taller_5.prueba;

import Taller_5.packageB.Moto;
import Taller_5.packageB.Vehiculo;

public class ClasePrueba {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Carro", "Mazda");
        Moto moto1 = new Moto("Moto", "Cr4", "125");

        vehiculo1.mostrarInfo();
        moto1.mostrarInfo();

        /*Error de compilacion: variables protegidas
        System.out.println(vehiculo1.tipo); 
        System.out.println(moto1.tipo); */
    }
}
