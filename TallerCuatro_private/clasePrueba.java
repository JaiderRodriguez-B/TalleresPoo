package TallerCuatro_private;

public class clasePrueba {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        System.out.println("\nNombre: "+estudiante1.getNombre());
        System.out.println("Edad: "+estudiante1.getEdad());
        System.out.println("Nota Promedio: "+ estudiante1.getNotaPromedio());

        Coche coche1 = new Coche();
        coche1.getMarca();
        
        //System.out.println("\n" + coche1.acelerar(10.5));
    }
}
