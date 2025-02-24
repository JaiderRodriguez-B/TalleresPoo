package Taller_5.packageB;

public class Vehiculo {
    protected static String tipo;
    protected String marca;
    public char[] Tipo; 

    public Vehiculo(){
        Vehiculo.tipo = "Sin asignar";
        this.marca = "Sin marca";
    }

    public Vehiculo(String tipo, String marca){
        Vehiculo.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInfo(){
        System.out.println("Tipo: " + tipo + "\n" + "Marca: " + marca + "\n");
    }
}