package es.studium.EjercicioPOO1;

public class Raza {
	private String nombreRaza;

	// Constructor por defecto:
	public Raza() 
	{
		nombreRaza = "";
	}

	// Constructor por parámetros:
	public Raza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}

	public String getNombreRaza() {
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}

}
