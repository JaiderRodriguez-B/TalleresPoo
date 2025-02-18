package TallerSeis;

public class Coche {
    String Marca;
    String Modelo;
    static int ContadorCoches = 0;

    public Coche(String Marca, String Modelo){
        this.Marca = Marca;
        this.Modelo = Modelo;
        IncrementoCoche();
    }

    public void IncrementoCoche(){
        ContadorCoches++;
    }

    public static void MostrarCantidadCoches(){
        System.out.println("Numero de coches: " + ContadorCoches + "\n");
    }
}
