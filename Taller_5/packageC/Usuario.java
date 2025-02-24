package Taller_5.packageC;

class Usuario extends Banco{
    String Nombre;
    
    Usuario(String Nombre, double saldo){
        super(saldo);
        this.Nombre = Nombre;
    }
    
    
    public void modificarSaldo(double saldo){
        this.saldo = saldo;
    } 
}
