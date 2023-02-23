package TestBanco;
public class Cliente {

	// Declaración de variables
	private String dni;
	private String nombre;
	private String direccion;

	// Constructor vacío
	public Cliente()
	{
		dni = "";
		nombre = "";
		direccion = "";		
	}

	// Constructor por parámetros
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// Método: Getter & Setter
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
