package es.studium.EjereciciosBoletin1;

import java.io.IOException;
import java.util.Scanner;

public class PreguntasRespuestas {

	private static String preguntaNombre = "�C�mo te llamas?";
	private static String preguntaEdad = "�Cu�ntos a�os tienes?";
	private static String preguntaCurso = "�En qu� curso est�s?";

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
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " a�os y est�s en " + curso);
	}
}
