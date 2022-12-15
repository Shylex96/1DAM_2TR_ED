package es.studium.EjereciciosBoletin1;

import java.io.IOException;
import java.util.Scanner;

public class PreguntasRespuestas {

	private static String preguntaNombre = "¿Cómo te llamas?";
	private static String preguntaEdad = "¿Cuántos años tienes?";
	private static String preguntaCurso = "¿En qué curso estás?";

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		System.out.println(preguntaNombre);
		String nombre = in.nextLine();

		System.out.println(preguntaEdad);
		String edad = in.nextLine();

		System.out.println(preguntaCurso);
		String curso = in.nextLine();


		mensaje(nombre, edad, curso);
		in.close();

	}

	public static void mensaje(String nombre, String edad, String curso) {
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y estás en " + curso);
	}
}
