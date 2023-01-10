package es.studium.EjereciciosBoletin1;

public class Geometria {

	private static final double PI = 3.14;

	public static void main(String[] args)
	{
		
		Geometria g = new Geometria ();
		
		int radio = 13; // radio del c�rculo;
		Geometria.longitudCircunferencia(radio);
		g.areaCirculo(radio);
		String string1 = "El perímetro del círculo es ";
		String string2 = "La superficie del círculo es ";
		
		
		double numero2 = 2 * PI * radio;
		System.out.println(string1 + numero2);
		double area = PI * radio * radio;
		System.out.println(string2 + area);

	}

	public void areaCirculo(int radio) {
		double area = PI * radio * radio;
		System.out.println("La superficie del círculo es "+ area);
	}

	public static void longitudCircunferencia(int radio) {
		double longitud = 2* PI * radio;
		System.out.println("El perímetro del círculo es " + longitud);
		
	}

}
