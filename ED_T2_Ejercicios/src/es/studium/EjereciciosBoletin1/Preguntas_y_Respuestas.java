package es.studium.EjereciciosBoletin1;
import java.io.IOException;
import java.util.Scanner;
public class Preguntas_y_Respuestas {

	public static void main(String[] args) throws IOException
	{
	Scanner in = new Scanner(System.in);
	System.out.println("�C�mo te llamas?");
	String a = in.nextLine();
	System.out.println("�Cu�ntos a�os tienes?");
	String b = in.nextLine();
	System.out.println("�En qu� curso est�s?");
	String c = in.nextLine();
	mensaje(a, b, c);
	in.close();}
	
	public static void mensaje(String x1, String x2, String x3)
	{
	System.out.println("Te llamas " + x1 + ", tienes " + x2 + " a�os y est�s en " + x3);
	}
	


}
