package es.studium.debugExamples;
import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		System.out.println("Indicar un n�mero:");
		num1 = teclado.nextInt();
		System.out.println("Indicar otro n�mero:");
		num2 = teclado.nextInt();
		teclado.close();
		System.out.println("La suma de los dos n�meros es: " +
				suma(num1,num2));
	}
	
	
	public static int suma (int a,int b)
	{
		return a+b;
	}


}


