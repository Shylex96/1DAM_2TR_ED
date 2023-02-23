package TestBanco;

public class Cuenta {

	// Declaración de variables
	private int numeroDeCuenta;
	private float saldo;
	private Cliente cliente;

	// Constructor vacío
	public Cuenta()
	{
		numeroDeCuenta = 0;
		saldo = 0.0f;
		cliente = new Cliente();	
	}

	// Constructor por parámetros
	public Cuenta(int numeroDeCuenta, float saldo, Cliente cliente) {
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	// Método: Getter & Setter
	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}