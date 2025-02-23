public class Estudiante extends Persona {
    public String nombre;

    @Override
    public void presentarse(){
        System.out.println("Mucho gusto me llamo "+ nombre +" y soy estudiante");
    }
}
