package Taller_8_Super.ejercicio2;

public class Pez extends Animal{
    public String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua){
        super(especie);
        this.tipoDeAgua = tipoDeAgua; 
    }
    
    @Override
    public void mostrarEspecie(){
        super.mostrarEspecie();
        System.out.println("Tipo de agua: "+ tipoDeAgua);
    }
}