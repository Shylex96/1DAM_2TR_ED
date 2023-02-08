package TestBanco;

/**
 * The main class that handles transactions between two clients and displays the updated balance of each client.
 * @author Esteban Albarran Tirado.
 * @version v1.0
 * @since 02/02/2023
 */

public class Principal {

	
	/** A constant with text - Refactor method 1. */
	private static final String LA_CUENTA_DE = "La cuenta de ";
	
	/**
	 * The main method that performs transactions between two clients and displays the updated balance of each client.
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen clientes del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n"); 
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		
		/** A Local Variable with text - Refactor method 2. */
		String eu = " euros.";

		/* Antonio y Beatriz consultan el saldo */
		System.out.println(LA_CUENTA_DE +
				cuentaAntonio.getCliente().getNombre() + " tiene " + cuentaAntonio.getSaldo() + eu);
		System.out.println(LA_CUENTA_DE +
				cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + eu);
		extracted(cuentaBeatriz, cuentaAntonio);
		/* Antonio y Beatriz vuelven a consultar su saldo para comprobar
		que todo ha ido bien */ System.out.println(LA_CUENTA_DE + cuentaAntonio.getCliente().getNombre() + " tiene " + cuentaAntonio.getSaldo() + eu);
		System.out.println(LA_CUENTA_DE +
				cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + eu);
		/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30); 
		/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
		System.out.println(LA_CUENTA_DE +
				cuentaAntonio.getCliente().getNombre() + " tiene " + cuentaAntonio.getSaldo() + eu);
		System.out.println(LA_CUENTA_DE +
				cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + eu);
		/* Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta */
		extracted(cuentaAntonio, cuentaBeatriz);
		System.out.println(LA_CUENTA_DE +
				cuentaAntonio.getCliente().getNombre() + " tiene " + cuentaAntonio.getSaldo() + eu);
		System.out.println(LA_CUENTA_DE + cuentaBeatriz.getCliente().getNombre() + " tiene " + cuentaBeatriz.getSaldo() + eu);
	}

	/**
	 * A private method that performs a transfer of 50 euros between two clients - Refactor method 3.
	 * @param cuentaAntonio the first client's account
	 * @param cuentaBeatriz the second client's account
	 */
	private static void extracted(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
	}
}
