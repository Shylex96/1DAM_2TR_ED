package es.studium.EjercicioPOO3;

public class Factura {

	private int idFactura;
	private String numeroFactura;
	private Pedido pedido;

	public Factura() {

		idFactura = 0;
		numeroFactura = "";
		pedido = new Pedido();

	}

	public Factura(int idFactura, String numeroFactura, Pedido pedido)

	{
		this.idFactura = idFactura;
		this.numeroFactura = numeroFactura;
		this.pedido = pedido;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
