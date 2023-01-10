package es.studium.EjercicioPOO1;

public class Principal {

	public static void main(String[] args) {
		Perro perro1 = new Perro(new Raza("Labrador"), 35.5f, 2, "Marrón");
		Perro perro2 = new Perro(new Raza("Golden Retriever"), 30.0f, 4, "Dorado");
		Perro perro3 = new Perro(new Raza("Bulldog"), 40.0f, 6, "Blanco");
		Perro perro4 = new Perro(new Raza("Poodle"), 25.0f, 3, "Negro");
		Perro perro5 = new Perro(new Raza("Beagle"), 32.0f, 5, "Café");

		System.out.println(
				"La raza del perro1 es: " + perro1.getRaza().getNombreRaza() + ", su tamaño es: " + perro1.getTamano()
				+ ", su edad es: " + perro1.getEdad() + " y es de color: " + perro1.getColor() + ".");

		System.out.println(
				"La raza del perro2 es: " + perro2.getRaza().getNombreRaza() + ", su tamaño es: " + perro2.getTamano()
				+ ", su edad es: " + perro2.getEdad() + " y es de color: " + perro2.getColor() + ".");

		System.out.println(
				"La raza del perro3 es: " + perro3.getRaza().getNombreRaza() + ", su tamaño es: " + perro3.getTamano()
				+ ", su edad es: " + perro3.getEdad() + " y es de color: " + perro3.getColor() + ".");

		System.out.println(
				"La raza del perro4 es: " + perro4.getRaza().getNombreRaza() + ", su tamaño es: " + perro4.getTamano()
				+ ", su edad es: " + perro4.getEdad() + " y es de color: " + perro4.getColor() + ".");

		System.out.println(
				"La raza del perro5 es: " + perro5.getRaza().getNombreRaza() + ", su tamaño es: " + perro5.getTamano()
				+ ", su edad es: " + perro5.getEdad() + " y es de color: " + perro5.getColor() + ".");
	}

}
