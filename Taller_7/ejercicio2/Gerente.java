package Taller_7.ejercicio2;

public class Gerente extends Empleado {
    
    public String nombre;
    public double salario, bono;

    public Gerente(String nombre, double salario, double bono) {
        this.nombre = nombre;
        this.salario = salario;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salario + bono;
    }

}
