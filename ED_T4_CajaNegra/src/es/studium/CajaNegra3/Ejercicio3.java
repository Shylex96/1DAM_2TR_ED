package es.studium.CajaNegra3;

public class Ejercicio3 {
	
	/* 1. Clases de equivalencia:
	 
	 Entrada:
	 Valores válidos para pedirProducto: (1) 1-50
	 Valores no válidos para pedirProducto: (2) Del 0 al Integer.MIN_VALUE (3) y del 51 al Integer.MAX_VALUE
	 
	 Entrada:
	 Valores válidos para seleccionarTipoPago: (4) 10, (5) 20, (6) 30, (7) 40 
	 Valores no válidos para seleccionarTipoPago: (8) Cualquier otro número entero  
	 
	 ---------------------------------------------------------------------------------------------------------
	 
	 Salida:
	 Valores válidos para pedirProducto: (9) 1
	 Valores no válidos para pedirProducto: (10) 0
	 
	 Salida:
	 Valores válidos para seleccionarTipoPago: (11) 1
	 Valores no válidos para seleccionarTipoPago: (12) 0
	 
	 
	 ---------------------------------------------------------------------------------------------------------
	 
	  2. ----- Clase de Equivalencia -------|------ Caso de Prueba ------|----- Resultado Esperado ------|
	    |-----------------------------------|----------------------------|-------------------------------|
		|			      1				    | pedirProducto(1);          |		         1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|			      2				    | pedirProducto(0);          |               0               |
		|-----------------------------------|----------------------------|-------------------------------|
		|			      3				    | pedirProducto(51);         |               0               |
		|-----------------------------------|----------------------------|-------------------------------|
		|			      4				    | seleccionarTipoPago(10);   |  			 1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 5				    | seleccionarTipoPago(20);   |               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 6                 | seleccionarTipoPago(30)    |               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 7                 | seleccionarTipoPago(40)    |               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 8                 | seleccionarTipoPago(12)    |               0               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 9                 | Ya estudiado               |               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 10                | Ya estudiado               |               0               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 11                | Ya estudiado               |               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 12                | Ya estudiado               |               0               |
		|------------------------------------------------------------------------------------------------|
	 
	 
	 */
	
	
	public static int pedirProducto(int identificador) {
		if ((identificador >= 1) && (identificador <= 50)) {
			// Hacer el pedido
			return 1;
		} else {
			return 0;
		}
	}

	public static int seleccionarTipoPago(int codigo) {
		switch (codigo) {
		case 10:
		case 20:
		case 30:
		case 40:
			return 1;
		default:
			return 0;
		}
	}
}
