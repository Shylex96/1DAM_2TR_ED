package es.studium.EjercicioPOO3;
import java.time.LocalDateTime;

public class Pedido {
	private int idPedido;
	private LocalDateTime fecha;
	private String referencia;

	public Pedido() {

		idPedido = 0;
		fecha = LocalDateTime.now();
		referencia = "";

	}

	public Pedido(LocalDateTime fecha, String referencia)

	{
		this.fecha = fecha;
		this.referencia = referencia;

	}

	public Pedido(int idPedido, LocalDateTime fecha, String referencia)

	{
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.referencia = referencia;

	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

}
