package es.studium.EjercicioCocheMoto;

public class Moto extends Vehiculo {

	private String cilindrada;

	public Moto() 
	{
		super();
		this.setMatricula("");
		this.setNumeroRuedas(2);
		this.cilindrada = "";
	}

	public Moto(String matricula, int numeroRuedas, String cilindrada) 
	{
		super(matricula, numeroRuedas);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

}
