package TallerSiete.ejercicio2;

public class Vendedor extends Empleado{
    public String nombre;
    public double salario;
    public int numeroVentas;

    public Vendedor(String nombre, double salario, int numeroVentas){
        this.nombre = nombre;
        this.salario = salario;
        this.numeroVentas = numeroVentas;
    }

    @Override
    public double calcularSalario(){
        return salario*numeroVentas;
    }
}
