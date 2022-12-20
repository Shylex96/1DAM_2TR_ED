package es.studium.EjercicioCocheMoto;

public class Vehiculo {

	protected String matricula;
	protected int numeroRuedas;

	public Vehiculo() 
	{
		matricula = "";
		numeroRuedas = 0;
	}
	
	public Vehiculo (String matricula, int numeroRuedas)
	{
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

}