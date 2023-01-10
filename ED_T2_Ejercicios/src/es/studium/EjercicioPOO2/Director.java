package es.studium.EjercicioPOO2;
import java.time.LocalDate;

public class Director {
	// Atributos privados:
	private String nombre;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	
	// Constructor vacío:
	public Director() {
	
		nombre = "";
		fechaNacimiento = LocalDate.of(0, 0, 0);
		nacionalidad = "";
	}

	// Constructor por parámetros
	public Director(String nombre, LocalDate fechaNacimiento, String nacionalidad) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}

	// Métodos Getters & Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	
}
