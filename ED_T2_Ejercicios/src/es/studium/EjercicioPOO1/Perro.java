package es.studium.EjercicioPOO1;

public class Perro {
	private Raza raza;
	private float tamano;
	private int edad;
	private String color;

	// Constructor por defecto:
	public Perro() {
		raza = new Raza();
		tamano = 0.0f;
		edad = 0;
		color = "";
	}

	// Constructor por parámetros:
	public Perro(Raza raza, float tamano, int edad, String color) {
		this.raza = raza;
		this.tamano = tamano;
		this.edad = edad;
		this.color = color;
	}
	
	// Getter & Setter:

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public float getTamano() {
		return tamano;
	}

	public void setTamano(float tamano) {
		this.tamano = tamano;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + ", color=" + color + "]";
	}
	
	

}
