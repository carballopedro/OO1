package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class Pedido {
	
	private FormaDePago pago;
	private FormaDeEnvio envio;
	private Producto producto;
	private int cant;
	
	public Pedido (FormaDePago pago, FormaDeEnvio envio, Producto producto, int cant) {
		this.pago = pago;
		this.envio = envio;
		this.producto = producto;
		this.cant = cant;
	}
	
	public String getCategoria() {
		return this.producto.getCategoria();
	}

	// Calcular el costo total de un pedido
	// (precio final en base a la forma de pago seleccionada) + (costo de envío en base a la forma de envío seleccionada).
	public double calcularCostoTotal(String destino) {
		// getPrecioFinal me devuelve 1 o 1.2 que equivale a 100% o 120% del producto, x eso multimplico luego por el precio del producto
		// getCostoDeEnvio ya me devuelve el costo del envio entre las dos direcciones
		return this.pago.getPrecioFinal()*this.producto.getPrecio() + this.envio.getCostoDeEnvio("origen", destino);
	}
	
}
