package TallerCuatro_public;

public class Empleado {
    public String nombre;
    private int salario;

    public Empleado(){
        nombre = "Sin nombre";
        salario = 0;
    }
    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        if(salario > 0){
            this.salario = salario;
        }
    }

    
}
