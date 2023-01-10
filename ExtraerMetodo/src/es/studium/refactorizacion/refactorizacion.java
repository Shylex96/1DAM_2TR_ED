package es.studium.refactorizacion;

public class refactorizacion {

	public static void main(String[] args) {
		int numero = 10 ;
		calcularFactorial(numero); //Hasta esta línea

	}

	private static void calcularFactorial(int numero) {
		int contador = 1; //Seleccionamos desde esta línea
		double resultado = 1;
		while (contador <= numero)
		{
			resultado = resultado * contador;
			contador++;
		}
		System.out.println(resultado);
	}
}
	
