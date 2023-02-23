package TestBanco;
public class Cliente {

	// Declaraci�n de variables
	private String dni;
	private String nombre;
	private String direccion;

	// Constructor vac�o
	public Cliente()
	{
		dni = "";
		nombre = "";
		direccion = "";		
	}

	// Constructor por par�metros
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// M�todo: Getter & Setter
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
