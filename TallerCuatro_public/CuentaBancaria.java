package TallerCuatro_public;

public class CuentaBancaria {
    private String numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    public CuentaBancaria(){
        numeroCuenta = "1001";
        saldo = 14000;
        tipoCuenta = "Credito";
    }
    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void mostrarCuenta(){
        System.out.println("\nNumero de cuenta: "+ numeroCuenta +"\nTipo de cuenta: "+ tipoCuenta +"\nSaldo: "+ saldo);
    }

}
