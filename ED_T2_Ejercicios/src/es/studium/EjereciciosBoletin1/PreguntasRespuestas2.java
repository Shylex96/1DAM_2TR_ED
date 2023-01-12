package es.studium.EjereciciosBoletin1;

import java.io.IOException;
import java.util.Scanner;

public class PreguntasRespuestas2 {

	private static final String EN_QUE_CURSO_ESTAS = "¿En qué curso estás?";
	private static final String CUANTOS_ANOS_TIENES = "¿Cuántos añs tienes?"; // Refactorizamos como Constante las
	// preguntas.
	private static final String COMO_TE_LLAMAS = "¿Cómo te llamas?";

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		preguntar(COMO_TE_LLAMAS);// Seleccionamos el syso entero, refactor extraer metodo
		String nombre = responder(teclado); // Extraemos como método los next LINE. Para que quede más bonito.

		preguntar(CUANTOS_ANOS_TIENES);
		String edad = responder(teclado);

		preguntar(EN_QUE_CURSO_ESTAS);
		String curso = responder(teclado);

		mensaje(nombre, edad, curso);

		teclado.close();
	}

	public static void preguntar(String pregunta) 
	// Dandole tipo String, y cambiandole el parametro a preguntar que
	// tenemos como constante para tenerlo en todas las lineas.
	{
		System.out.println(pregunta);
	}

	public static String responder(Scanner teclado) {
		return teclado.nextLine();
	}

	public static void mensaje(String nombre, String edad, String curso) {
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " aÃ±os y estÃ¡s en " + curso);
	}

}
