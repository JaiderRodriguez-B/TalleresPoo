package Taller_6;

public class Errores_Static {
    private String NombreProducto;
    private int StockProducto;

    /*public static void setStock(int Stock_Producto){
        this.Stock_Producto = Stock_Producto;
    } 
        Este metodo trata de settear un dato en una variable no estatica,
        y un metodo static no recibe instancias de clase por tanto no podra acceder al atributo.
        para corregirlo debemos declarar el metodo no estatico pues stock 
        no es un dato que necesite ser statico en este caso*/
    public String getNombreProducto(){
        return NombreProducto;
    }

    public void setStock(int Stock_Producto){
        this.StockProducto = Stock_Producto;
    } 

    public int getStock() {
        return StockProducto;
    }
}
