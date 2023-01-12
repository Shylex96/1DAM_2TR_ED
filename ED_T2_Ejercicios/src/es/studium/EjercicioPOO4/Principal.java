package es.studium.EjercicioPOO4;

public class Principal {

	public static void main(String[] args) {
		CentroDeTrabajo centroDeTrabajo1 = new CentroDeTrabajo("Sur", "C/ Rust º13");
		Departamento departamento1 = new Departamento("Sonido", centroDeTrabajo1);
		Empleado empleado1 = new Empleado("Juan", "Álvarez Gutiérrez", departamento1);

		CentroDeTrabajo centroDeTrabajo2 = new CentroDeTrabajo("Grystel", "C/ Rust º13");
		Departamento departamento2 = new Departamento("Edición", centroDeTrabajo2);
		Empleado empleado2 = new Empleado("Javier", "Melenas García", departamento2);

		CentroDeTrabajo centroDeTrabajo3 = new CentroDeTrabajo("Meléndez", "C/ Rust º13");
		Departamento departamento3 = new Departamento("Gráfico", centroDeTrabajo3);
		Empleado empleado3 = new Empleado("Esteban", "Gómbez Baena", departamento3);

		CentroDeTrabajo centroDeTrabajo4 = new CentroDeTrabajo("Norte", "C/ Rust º13");
		Departamento departamento4 = new Departamento("Animación", centroDeTrabajo4);
		Empleado empleado4 = new Empleado("Sara", "Fernández Cortés", departamento4);

		CentroDeTrabajo centroDeTrabajo5 = new CentroDeTrabajo("Polígono Perca", "C/ Rust º13");
		Departamento departamento5 = new Departamento("PostProducción", centroDeTrabajo5);
		Empleado empleado5 = new Empleado("Juan", "Albarrán Franco", departamento5);

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
