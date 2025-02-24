package Taller_4_public;

import java.util.Scanner;

public class ClasePrueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1 = new Empleado();
        System.out.println("\nNombre del empleado: " + empleado1.nombre + ", Salario: " + empleado1.getSalario());

        CuentaBancaria cuenta1 = new CuentaBancaria();
        // empleado1.numeroCuenta; // Error de compilación: numeroCuenta no es visible
        cuenta1.mostrarCuenta();

        Scanner read = new Scanner(System.in);
        int numeroA, numeroB;
        
        System.out.print("Ingrese el primer numero: ");
        numeroA = read.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numeroB = read.nextInt();
        System.out.println("");
        Utilidades.suma(numeroA, numeroB);
        Utilidades.resta(numeroA, numeroB);
        Utilidades.multiplicacion(numeroA, numeroB);
        Utilidades.divicion(numeroA, numeroB);
        read.close();

    }
}
