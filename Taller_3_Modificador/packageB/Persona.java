package TallerTres_Modificador.packageB;

class Persona {
    
    private String nombre;
    int edad ;

    public Persona(){
        nombre = "Sin nombre ";
        edad = 0;
    }

    public Persona(String nombre,int edad ){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
