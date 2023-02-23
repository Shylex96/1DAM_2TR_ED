package es.studium.CajaNegra2;

public class Ejercicio2 {
	
	/* 1. Clases de equivalencia:
	 
	 Entrada:
	 Valores v�lidos: (1) Rojo, (2) Amarillo, (3) Verde
	 Valores no v�lidos: (4) Cualquier otra cadena.
	 
	 Salida:
	 Valores v�lidos: (5) 1 
	 Valores no v�lidos: (6) 0
	 
	 2. ----- Clase de Equivalencia --------|------ Caso de Prueba ------|----- Resultado Esperado ------|
		|-----------------------------------|----------------------------|-------------------------------|
		|			      1				    | cambiarSemaforo("Rojo");   |		         1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|			      2				    |cambiarSemaforo("Amarillo");|               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|			      3				    | cambiarSemaforo("Verde");  |               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|			      4				    | cambiarSemaforo("Azul");   |  			 0               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 5				    |       Ya estudiado         |               1               |
		|-----------------------------------|----------------------------|-------------------------------|
		|                 6                 |       Ya estudiado         |                0              |
		|-----------------------------------|----------------------------|-------------------------------|
		|------------------------------------------------------------------------------------------------|
	*/

		public static int cambiarSemaforo (String color)
		{
		if(color=="rojo")
		{
		// Cambiar sem�foro a ROJO
		return 1;
		}
		else if(color=="amarillo")
		{
		// Cambiar sem�foro a AMARILLO
		return 1;
		}
		else if(color=="verde")
		{
		// Cambiar sem�foro a VERDE
		return 1;
		}
		else
		{
		return 0;
		}
		}


	}

