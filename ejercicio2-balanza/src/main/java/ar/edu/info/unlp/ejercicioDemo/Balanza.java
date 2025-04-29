package ar.edu.info.unlp.ejercicioDemo;

public class Balanza {
	
	/*
	 * Definición de variables
	 */
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	/*
	 * Métodos
	 */
	
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;			
	}

	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.cantidadDeProductos, this.precioTotal, this.pesoTotal);
		return ticket;
		
	}
	
	
	/*
	 * Getters
	 */
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
}
