package TallerUno;

public class CuentaBancaria {
	public String numeroCuenta, tipoCuenta;
	public int saldo;

	public CuentaBancaria(){
		this.numeroCuenta = "1";
		this.tipoCuenta = "Credito";
		this.saldo = 0;
	}

	public CuentaBancaria (String numeroCuenta, String tipoCuenta){
		this.numeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
	}

	public CuentaBancaria(String numeroCuenta, String tipoCuenta, int saldo){
		this(numeroCuenta, tipoCuenta);
		this.saldo = saldo;
	}

	public String toString() {
		return "\nNumero de cuenta: " + numeroCuenta + "\nTipo de cuenta: " + tipoCuenta + "\nSaldo: " + saldo;
	}
}
