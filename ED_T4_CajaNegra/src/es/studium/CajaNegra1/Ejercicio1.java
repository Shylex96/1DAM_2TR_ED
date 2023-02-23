package es.studium.CajaNegra1;

public class Ejercicio1 {
	
	
	/* 1. Clases de equivalencia:
	 
	   		a) Para las entradas:
				- Valores válidos.
				- Valores no válidos.
			b) Para las salidas:
				- Valores válidos.
				- Valores no válidos.
				
		----------------------------------
		Para a) entradas:
		
		Entradas: CEV = Del 1 al 12 (1)
		Entradas: CNEV = Del 0 al Integer.MIN_VALUE (2) y del 13 al Integer.MAX_VALUE (3)
		(1)(2)(3) nos dice que son tres casos de equivalencia, por lo tanto tendremos tres casos de prueba.
		
		Para b) salidas:
		
		Salidas: CEV = 28 (4), 30 (5), 31 (6) 
		Salidas: CNEV = 0 (7)
		Si seguimos contando para b (salidas), en total tendremos 8 casos de prueba.
		
		2. ----- Clase de Equivalencia -----|----- Caso de Prueba -----|----- Resultado Esperado ------|
		|-----------------------------------|--------------------------|-------------------------------|
		|			      1				    |		diasDeMes(1);      |		      31               |
		|-----------------------------------|--------------------------|-------------------------------|
		|			      2				    | 	    diasDeMes(0);      |               0               |
		|-----------------------------------|--------------------------|-------------------------------|
		|			      3				    |	    diasDeMes(13);     |               0               |
		|-----------------------------------|--------------------------|-------------------------------|
		|			      4				    |	    diasDeMes(2);      |  			  28               |
		|-----------------------------------|--------------------------|-------------------------------|
		|                 5				    |       diasDeMes(11);     |              30               |
		|-----------------------------------|--------------------------|-------------------------------|
		|                 6                 |       Ya estudiado       |              31               |
		|-----------------------------------|--------------------------|-------------------------------|
		|                 7                 |       Ya estudiado       |               0               |
		|-----------------------------------|--------------------------|-------------------------------|
		|----------------------------------------------------------------------------------------------|
		
		
		 
	 
	*/

	public static int diasDeMes(int mes) {
		int resultado = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			resultado = 31;
			System.out.println(resultado);
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			resultado = 30;
			System.out.println(resultado);
			break;
		}
		case 2: {
			resultado = 28;
			System.out.println(resultado);
			break;
		}
		default: {
			resultado = 0;
			System.out.println(resultado);
			break;
		}
		}
		return resultado;
	}
}
