package TallerTres_Modificador.vehiculos;

class Moto extends Vehiculo {
    
    Moto(String tipo){
        super(tipo);
    }

    void mostrar(){
        System.out.println("Tipo de moto: " + tipo);
    }
    
}
