package Taller_5.packageA;

public class Gerente extends Empleado {
    String Departamento;

    public Gerente(double Salario, String Nombre, String Departamento){
        super(Salario, Nombre);
        this.Departamento = Departamento;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del gerente: " + Nombre + "\n" + "Salario: " + Salario + "\n" + "Departamento: "
        + Departamento + "\n");
    }
}
