package TallerUno;

public class Estudiante {
	public String nombre, edad, curso;

	public Estudiante() {
		this.nombre = "Sin nombre ";
		this.edad = "Sin asignar ";
		this.curso = "Sin curso ";
	}

	public Estudiante(String nombre, String edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Estudiante(String nombre, String edad, String curso) {
		this(nombre, edad);
		this.curso = curso;
	}

	public String toString() {
		return "\nNombre del estudiante: " + nombre + "\nEdad del estudiante: " + edad + "\nCurso del estudiante: " + curso;
	}
}
