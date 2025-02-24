package Taller_5.packageC;

public class Banco {
    /*  protected double Saldo; - El Atributo Saldo es accesible para subclases dentro y fuera del paquete 
    y clases dentro del paquete, esta variable debe ser protegida  */
    //Dejar el atributo Saldo en private es mas optimo pues solo la clase Banco podra modificarlo.
    protected double saldo;
    
    public Banco(double saldo){
        setSaldo(saldo);
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo<=0){
            System.out.println("ERROR: Saldo invalido");
        }else{
            this.saldo = saldo;
        }
    }
}
