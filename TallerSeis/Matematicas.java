package TallerSeis;

public class Matematicas {
    public static void Suma(int N1, int N2){
        System.out.println("La suma " + N1 + " + " + N2 + " es igual a: " + (N1+N2) + "\n");
    }
    
    public static void Resta(int N1, int N2){
        System.out.println("La Resta " + N1 + " - " + N2 + " es igual a: " + (N1-N2) + "\n");
    }

    public static void Multiplicacion(int N1, int N2){
        System.out.println("La multiplicacion " + N1 + " x " + N2 + " es igual a: " + (N1*N2) + "\n");
    }

    public static void Division(double N1, double N2){
        if(N2 == 0){
            System.out.println("ERROR: No se puede dividir entre 0.");
        }else{
            System.out.println("La division " + N1 + " / " + N2 + " es igual a: " + (N1/N2) + "\n");
        }
    }
}
