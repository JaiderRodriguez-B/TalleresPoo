package TallerCuatro_private;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(){
        nombre = "Sin Nombre";
        edad = 0;
        notaPromedio = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        if(edad > 0){
            this.edad  =edad;
        }
    }
    public double getNotaPromedio(){
        return notaPromedio;
    }
    public void setNotaPromedio(double notaPromedio){
        if(notaPromedio >= 0 && notaPromedio <=5){
            this.notaPromedio = notaPromedio;
        }
    }
}
