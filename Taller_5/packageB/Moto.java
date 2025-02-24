package Taller_5.packageB;

public class Moto extends Vehiculo{
    String Cilindraje;
    
    public Moto(String tipo, String marca, String Cilindraje){
        super(tipo,marca);
        this.Cilindraje = Cilindraje;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("\nTipo: " + tipo + "\n" + "Marca: " + marca + "\n" + "Cilindrada: " + Cilindraje + "\n");
    }
}
