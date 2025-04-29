package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Balanza {
	
	// Defino variables
	
	private ArrayList<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<>();
	}
	
	// Métodos
	
	public void ponerEnCero() {
		// vaciar lista
		// puedo instanciar una lista nueva (desventaja: se pierde referencia si otro objeto la tenia)
		this.productos.clear();
				
	}
	
	public void agregarProducto(Producto producto) {	
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.productos, getPesoTotal(), getPrecioTotal());
		return ticket;
		
	}
	
	
	// Getters
	
	public ArrayList<Producto> getProductos(){
		return this.productos;
	}
	
	public int getCantidadDeProductos() {
		// return (int) this.lista.size();
		return (int) this.productos.stream()
				.count();
	}
	
	public double getPrecioTotal() {
		return (double) this.productos.stream()
				.mapToDouble(producto -> producto.getPrecio())
				.sum();
	}
	
	public double getPesoTotal() {
		return (double) this.productos.stream()
				.mapToDouble(producto -> producto.getPeso())
				.sum();
	}
	
}
