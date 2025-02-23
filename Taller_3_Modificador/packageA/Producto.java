package TallerTres_Modificador.packageA;

class Producto {
    String nombre, stock;
    int precio;
    public Object mostrarInfo; 

    Producto(){
        nombre = "Sin asignar";
        precio = 0;
        stock = "Sin asignar";
    }

    void mostrarInfo(){
        System.out.println("\nNombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}
