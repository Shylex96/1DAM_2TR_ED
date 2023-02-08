package TestBanco;

/**
 * POJO class that represents a bank customer.
 * @author Esteban Albarran Tirado.
 * @version v1.0
 * @since 02/02/2023
 */

public class Cliente {

	/** Customer's ID. */
	private String dni;
	
	/** Customer's Name. */
	private String nombre;
	
	/** Customer's Adress.*/
	private String direccion;

	
	/** Empty Constructor - Initialize all variables to a default value. */
	public Cliente() {
		dni = "";
		nombre = "";
		direccion = "";
	}

	/**
	 * Parametized Constructor - Initialize variables 
	 * with the values passed as arguments.
	 * 
	 * @param dni Customer's ID.
	 * @param nombre Customer's Name.
	 * @param direccion Customer's Adress.
	 */
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	/**
	 * Returns the Customer's ID.
	 * 
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Sets the Client's ID.
	 * 
	 * @param dni Sets ID from Client.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Returns Client's Name.
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets Client's Name.
	 * 
	 * @param nombre Sets Name from Client.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Returns the Customer's Address.
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the Customer's Adress.
	 * 
	 * @param direccion Sets Name from Client.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
