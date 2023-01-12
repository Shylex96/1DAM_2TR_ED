package es.studium.EjercicioPOO4;

public class CentroDeTrabajo {

	private int idCentroDeTrabajo;
	private String nombreCentroTrabajo;
	private String direccionCentroTrabajo;

	public CentroDeTrabajo()
	{
		idCentroDeTrabajo = 0;
		nombreCentroTrabajo = "";
		direccionCentroTrabajo = "";		
	}

	public CentroDeTrabajo(int idCentroDeTrabajo, String nombreCentroTrabajo, String direccionCentroTrabajo) {
		this.idCentroDeTrabajo = idCentroDeTrabajo;
		this.nombreCentroTrabajo = nombreCentroTrabajo;
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}

	public CentroDeTrabajo(String nombreCentroTrabajo, String direccionCentroTrabajo) {
		this.nombreCentroTrabajo = nombreCentroTrabajo;
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}

	public int getIdCentroDeTrabajo() {
		return idCentroDeTrabajo;
	}

	public void setIdCentroDeTrabajo(int idCentroDeTrabajo) {
		this.idCentroDeTrabajo = idCentroDeTrabajo;
	}

	public String getNombreCentroTrabajo() {
		return nombreCentroTrabajo;
	}

	public void setNombreCentroTrabajo(String nombreCentroTrabajo) {
		this.nombreCentroTrabajo = nombreCentroTrabajo;
	}

	public String getDireccionCentroTrabajo() {
		return direccionCentroTrabajo;
	}

	public void setDireccionCentroTrabajo(String direccionCentroTrabajo) {
		this.direccionCentroTrabajo = direccionCentroTrabajo;
	}





}
