package es.studium.EjereciciosBoletin1;

import java.io.IOException;
import java.util.Scanner;

public class PreguntasRespuestas1 {

	private static String preguntaNombre = "�C�mo te llamas?";
	private static String preguntaEdad = "�Cu�ntos a�os tienes?";
	private static String preguntaCurso = "�En qu� curso est�s?";

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		String nombre = preguntaNombre(teclado);
		String edad = preguntaEdad(teclado);
		String curso = preguntaCurso(teclado);
		mensaje(nombre, edad, curso);
		teclado.close();
	}

	public static String preguntaCurso(Scanner teclado) {
		System.out.println(preguntaCurso);
		String curso = teclado.nextLine();
		return curso;
	}

	public static String preguntaEdad(Scanner teclado) {
		System.out.println(preguntaEdad);
		String edad = teclado.nextLine();
		return edad;
	}

	public static String preguntaNombre(Scanner teclado) {
		System.out.println(preguntaNombre);
		String nombre = teclado.nextLine();
		return nombre;
	}

	public static void mensaje(String nombre, String edad, String curso) {
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " a�os y est�s en " + curso);
	}

}
