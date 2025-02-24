package Taller_1;

import java.util.Scanner;

public class Integrador {
	public static Libro libro1 ;
	public static Estudiante estudiante1 ;
	public static CuentaBancaria cuenta1 ;
	public static Libro libro2 ;
	public static Scanner read = new Scanner(System.in);

	public Integrador(){
		libro1 = new Libro();
		cuenta1 = new CuentaBancaria();
		estudiante1 = new Estudiante();
		libro2 = new Libro();
	}

	public static void main(String[] args) {
		String titulo_, autor_, numeroPaginas_, nombre_, edad_, curso_, numeroCuenta_, tipoCuenta_ ;
		int saldo_ ; 
		
		System.out.print("ingresa el titulo del libro: ");
		titulo_ = read.nextLine();
		System.out.print("ingresa el autor del libro: ");
		autor_ = read.nextLine();
		System.out.print("ingresa el numero de paginas del libro: ");
		numeroPaginas_ = read.nextLine();
		
		System.out.print("ingresa el nombre del estudiante: ");
		nombre_= read.nextLine();
		System.out.print("ingresa la edad del estudiante: ");
		edad_ = read.nextLine();
		System.out.print("ingresa el culso del estudiante: ");
		curso_ = read.nextLine();

		System.out.print("ingresa el numero de cuenta: ");
		numeroCuenta_= read.nextLine();
		System.out.print("ingresa el tipo de cuenta: ");
		tipoCuenta_ = read.nextLine();
		System.out.print("ingresa el saldo de la cuenta: ");
		saldo_ = read.nextInt();


		libro1 = new Libro(titulo_,autor_,numeroPaginas_);
		estudiante1 = new Estudiante(nombre_,edad_,curso_);
		cuenta1 = new CuentaBancaria(numeroCuenta_,tipoCuenta_,saldo_);
		

		System.out.println("\n" + libro1.toString() + "\n" + estudiante1.toString() + "\n" + cuenta1.toString() +"\n");
		
	}

}
