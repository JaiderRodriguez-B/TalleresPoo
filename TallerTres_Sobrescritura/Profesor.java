public class Profesor extends Persona {
    public String nombre;
    public String asignatura;

    @Override
    public void presentarse(){
        System.out.println("Mucho gusto me llamo "+ nombre +" profesor de "+asignatura);
    }
}
