package TallerDos;

public class Producto {

    String nombre, precio ;

    public Producto(String nombre, String precio){
        this.nombre = nombre ;
        this.precio = precio ;
    }
    
    public void mostrarProducto(){
        System.out.println("\nNombre: " + this.nombre + ", Precio: ");
    }
}