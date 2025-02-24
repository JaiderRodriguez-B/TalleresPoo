package Taller_8_Super.ejercicio1;

public class Empleado extends Persona {
    
    public String departamento;

    public Empleado(String nombre, int edad, String deparatamento){
        super(nombre, edad);
        this.departamento = deparatamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: "+ departamento);
    }

}