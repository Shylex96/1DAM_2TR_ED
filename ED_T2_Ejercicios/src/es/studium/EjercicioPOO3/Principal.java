package es.studium.EjercicioPOO3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
		
		// Obtener la fecha y hora actual:
		LocalDateTime now = LocalDateTime.now();
		
		// Declarar la variable con el patrón que queremos que salga por pantalla: 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		// Ahora el string llamado formatDateTime tomará el formato dado anteriormente.
		String formatDateTime = now.format(formatter);
		
		Pedido pedido1 = new Pedido(LocalDateTime.now(), "PED-01");
		Pedido pedido2 = new Pedido(LocalDateTime.now(), "PED-02");
		Factura factura1 = new Factura(1, "Fac-01", pedido1);
		Factura factura2 = new Factura(2, "Fac-02", pedido2);

		System.out.println("La factura con id: " + factura1.getIdFactura()
				+ " y número: " + factura1.getNumeroFactura()
				+ " está asociada al Pedido de referencia: " + factura1.getPedido().getReferencia()
				+ " emitido con fecha: " + formatDateTime);

		System.out.println("La factura con id: " + factura2.getIdFactura()
				+ " y número: " + factura2.getNumeroFactura()
				+ " está asociada al Pedido de referencia: " + factura2.getPedido().getReferencia()
				+ " emitido con fecha: " + formatDateTime);
	}
}
