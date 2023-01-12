package es.studium.EjercicioPOO4;

public class Departamento {

	private int idDepartamento;
	private String nombreDepartamento;
	private CentroDeTrabajo centroDeTrabajo;
	
	public Departamento() 
	{
		idDepartamento = 0;
		nombreDepartamento = "";
		centroDeTrabajo = new CentroDeTrabajo();
	}

	public Departamento(int idDepartamento, String nombreDepartamento, CentroDeTrabajo centroDeTrabajo) {
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.centroDeTrabajo = centroDeTrabajo;
	}

	public Departamento(String nombreDepartamento, CentroDeTrabajo centroDeTrabajo) {
		this.nombreDepartamento = nombreDepartamento;
		this.centroDeTrabajo = centroDeTrabajo;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public CentroDeTrabajo getcentroDeTrabajo() {
		return centroDeTrabajo;
	}

	public void setcentroDeTrabajo(CentroDeTrabajo centroDeTrabajo) {
		this.centroDeTrabajo = centroDeTrabajo;
	}
	
	
	
	
}
