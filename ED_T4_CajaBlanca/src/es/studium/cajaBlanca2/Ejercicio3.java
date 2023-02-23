package es.studium.cajaBlanca2;

public class Ejercicio3 {

	public static String edadPerro(int e) {

		double edad = 0;

		if (e < 0) {

			return "La edad debe ser un número positivo.";

		} else if (e <= 2) {

			edad = e * 10.5;

			return "La edad es " + edad;

		} else {

			edad = 21 + (e - 2) * 4;

			return "La edad es " + edad;

		}

	}

}
