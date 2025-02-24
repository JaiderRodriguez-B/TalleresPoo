package Taller_8_Herencia.ejercicio3;

public class Gerente extends Empleado {
    
    public String nombre, departamento;
    public double salario;

    public Gerente(String nombre, int salario, String deparatamento){
        super(nombre, salario);
        this.departamento = deparatamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: "+ departamento);
    }

}