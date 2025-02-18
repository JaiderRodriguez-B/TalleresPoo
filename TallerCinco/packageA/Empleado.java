package TallerCinco.packageA;

public class Empleado {
    protected double Salario;
    protected String Nombre;

    public Empleado(double Salario, String Nombre){
        this.Salario = Salario;
        this.Nombre = Nombre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del Empleado: " + Nombre + "\n" + "Salario: " + Salario + "\n");
    }
}
