package TallerTres_Modificador.packageA;

class clasePrueba {

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        System.out.println("\nNombre: " + producto1.nombre + ", Precio: " + producto1.precio + ", Stock: " + producto1.stock );
        producto1.mostrarInfo();
        
        //Vehiculo Vehiculo1 = new Vehiculo();
    }
}