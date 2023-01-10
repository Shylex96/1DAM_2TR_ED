package es.studium.EjercicioPOO2;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// Crear objetos de tipo Pelicula
		Director director1 = new Director("Steven Spielberg", LocalDate.of(1946, 12, 18), "Estadounidense");
		Pelicula pelicula1 = new Pelicula("Jaws", 1975, 124, director1);

		Director director2 = new Director("Quentin Tarantino", LocalDate.of(1963, 3, 27), "Estadounidense");
		Pelicula pelicula2 = new Pelicula("Pulp Fiction", 1994, 154, director2);

		Director director3 = new Director("Christopher Nolan", LocalDate.of(1970, 7, 30), "Británico");
		Pelicula pelicula3 = new Pelicula("The Dark Knight", 2008, 152, director3);

		Director director4 = new Director("Martin Scorsese", LocalDate.of(1942, 11, 17), "Estadounidense");
		Pelicula pelicula4 = new Pelicula("The Departed", 2006, 151, director4);

		Director director5 = new Director("Alfonso Cuarón", LocalDate.of(1961, 11, 28), "Mexicano");
		Pelicula pelicula5 = new Pelicula("Gravity", 2013, 91, director5);

		// Imprimir información de las peliculas
		System.out.println("Pelicula 1:");
		System.out.println("Titulo: " + pelicula1.getTitulo());
		System.out.println("Año: " + pelicula1.getAno());
		System.out.println("Duración: " + pelicula1.getDuracion() + " minutos");
		System.out.println("Director: " + pelicula1.getDirector().getNombre() + ", Nacionalidad: "
				+ pelicula1.getDirector().getNacionalidad());
		System.out.println();

		System.out.println("Pelicula 2:");
		System.out.println("Titulo: " + pelicula2.getTitulo());
		System.out.println("Año: " + pelicula2.getAno());
		System.out.println("Duración: " + pelicula2.getDuracion() + " minutos");
		System.out.println("Director: " + pelicula2.getDirector().getNombre() + ", Nacionalidad: "
				+ pelicula2.getDirector().getNacionalidad());
		System.out.println();

		System.out.println("Pelicula 3:");
		System.out.println("Titulo: " + pelicula3.getTitulo());
		System.out.println("Año: " + pelicula3.getAno());
		System.out.println("Duración: " + pelicula3.getDuracion() + " minutos");
		System.out.println("Director: " + pelicula3.getDirector().getNombre() + ", Nacionalidad: "
				+ pelicula3.getDirector().getNacionalidad());
		System.out.println();

		System.out.println("Pelicula 4:");
		System.out.println("Titulo: " + pelicula4.getTitulo());
		System.out.println("Año: " + pelicula4.getAno());
		System.out.println("Duración: " + pelicula4.getDuracion() + " minutos");
		System.out.println("Director: " + pelicula4.getDirector().getNombre() + ", Nacionalidad: "
				+ pelicula4.getDirector().getNacionalidad());
		System.out.println();

		System.out.println("Pelicula 5:");
		System.out.println("Titulo: " + pelicula5.getTitulo());
		System.out.println("Año: " + pelicula5.getAno());
		System.out.println("Duración: " + pelicula5.getDuracion() + " minutos");
		System.out.println("Director: " + pelicula5.getDirector().getNombre() + ", Nacionalidad: "
				+ pelicula5.getDirector().getNacionalidad());
	}

}
