package es.studium.debugExamples;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int base, exp, i;
		int resultado=1;
		System.out.println("Indicar el valor de la base:");
		base = teclado.nextInt();
		System.out.println("Indicar el valor del exponente:");
		exp = teclado.nextInt();
		teclado.close();
		for (i=1;i<=exp;i++)
		{
			resultado=resultado*base;
		}
		System.out.println("El número "+base+" elevado a "+exp+" es igual a "+resultado);
	}

}
