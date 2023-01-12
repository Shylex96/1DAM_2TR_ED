package es.studium.EjercicioPOO4;

public class Principal {

	public static void main(String[] args) {
		CentroDeTrabajo centroDeTrabajo1 = new CentroDeTrabajo("Sur", "C/ Rust �13");
		Departamento departamento1 = new Departamento("Sonido", centroDeTrabajo1);
		Empleado empleado1 = new Empleado("Juan", "�lvarez Guti�rrez", departamento1);

		CentroDeTrabajo centroDeTrabajo2 = new CentroDeTrabajo("Grystel", "C/ Rust �13");
		Departamento departamento2 = new Departamento("Edici�n", centroDeTrabajo2);
		Empleado empleado2 = new Empleado("Javier", "Melenas Garc�a", departamento2);

		CentroDeTrabajo centroDeTrabajo3 = new CentroDeTrabajo("Mel�ndez", "C/ Rust �13");
		Departamento departamento3 = new Departamento("Gr�fico", centroDeTrabajo3);
		Empleado empleado3 = new Empleado("Esteban", "G�mbez Baena", departamento3);

		CentroDeTrabajo centroDeTrabajo4 = new CentroDeTrabajo("Norte", "C/ Rust �13");
		Departamento departamento4 = new Departamento("Animaci�n", centroDeTrabajo4);
		Empleado empleado4 = new Empleado("Sara", "Fern�ndez Cort�s", departamento4);

		CentroDeTrabajo centroDeTrabajo5 = new CentroDeTrabajo("Pol�gono Perca", "C/ Rust �13");
		Departamento departamento5 = new Departamento("PostProducci�n", centroDeTrabajo5);
		Empleado empleado5 = new Empleado("Juan", "Albarr�n Franco", departamento5);

		System.out.println("El trabajador/a " + empleado1.getNombreEmpleado() + " " + empleado1.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado1.getDepartamento().getNombreDepartamento()
				+ " que corresponde al centro de trabajo "
				+ empleado1.getDepartamento().getcentroDeTrabajo().getNombreCentroTrabajo() + ".");
		System.out.println("El trabajador/a " + empleado2.getNombreEmpleado() + " " + empleado2.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado2.getDepartamento().getNombreDepartamento()
				+ " que corresponde al centro de trabajo "
				+ empleado2.getDepartamento().getcentroDeTrabajo().getNombreCentroTrabajo() + ".");
		System.out.println("El trabajador/a " + empleado3.getNombreEmpleado() + " " + empleado3.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado3.getDepartamento().getNombreDepartamento()
				+ " que corresponde al centro de trabajo "
				+ empleado3.getDepartamento().getcentroDeTrabajo().getNombreCentroTrabajo() + ".");
		System.out.println("El trabajador/a " + empleado4.getNombreEmpleado() + " " + empleado4.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado4.getDepartamento().getNombreDepartamento()
				+ " que corresponde al centro de trabajo "
				+ empleado4.getDepartamento().getcentroDeTrabajo().getNombreCentroTrabajo() + ".");
		System.out.println("El trabajador/a " + empleado5.getNombreEmpleado() + " " + empleado5.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado5.getDepartamento().getNombreDepartamento()
				+ " que corresponde al centro de trabajo "
				+ empleado5.getDepartamento().getcentroDeTrabajo().getNombreCentroTrabajo() + ".");
	}
}
