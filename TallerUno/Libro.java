package TallerUno;

public class Libro {
	public String titulo, autor, numeroPaginas;

	public Libro() {
		this.titulo = "Sin titulo";
		this.autor = "Sin autor";
		this.numeroPaginas = "0";
	}

	public Libro(String titulo, String autor, String numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public void mostrarLibro() {
		System.out.println("\nTitulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Numero de paginas: " + numeroPaginas);
	}

	public String toString() {
		return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nNumero de paginas: " + numeroPaginas;
	}
}
