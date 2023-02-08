package TestBanco;

/**
 * POJO class that represents a bank customer's account.
 * @author Esteban Albarran Tirado.
 * @version v1.0
 * @since 02/02/2023
 */

public class Cuenta {

	/** The account number. */
	private int numeroDeCuenta;
	
	/** The account balance. */
	private float saldo;
	
	/** The account's customer. */
	private Cliente cliente;

	
	/** Empty Constructor - Initialize all variables to a default value. */
	public Cuenta()
	{
		numeroDeCuenta = 0;
		saldo = 0.0f;
		cliente = new Cliente();	
	}

	/**
	 * Parametized Constructor - Initialize variables 
	 * with the values passed as arguments.
	 * 
	 * @param numeroDeCuenta The Account Number.
	 * @param saldo The Account Balance.
	 * @param cliente The Account's Customer.
	 */
	public Cuenta(int numeroDeCuenta, float saldo, Cliente cliente) {
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	/**
	 * Returns the Account Number.
	 * 
	 * @return numeroDeCuenta
	 */
	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	/**
	 * Sets the Account Number.
	 * 
	 * @param numeroDeCuenta Sets the Account Number.
	 */
	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	/**
	 * Returns the Account Balance.
	 * 
	 * @return saldo
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * Sets the Account Balance.
	 * 
	 * @param saldo Sets the Account Balance.
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * Sets the account's customer.
	 * 
	 * @return cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Sets the Account's Customer.
	 * 
	 * @param cliente Sets the Account's Customer.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}