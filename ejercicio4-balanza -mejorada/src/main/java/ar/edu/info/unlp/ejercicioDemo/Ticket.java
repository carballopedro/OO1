package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {

	// Defino variables
	
	private LocalDate fecha;
	private double precioTotal;
	private double pesoTotal;
	private ArrayList<Producto> productos;
	
	
	// Constructor
	
	public Ticket(ArrayList<Producto> lista, double pesoTotal, double precioTotal) {
		this.fecha = LocalDate.now();
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
		this.productos = lista;
	}
	
	
	// Getters
	
	public ArrayList<Producto> getProductos(){
		return this.productos;
	}
	
	public Double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
	
	public LocalDate getFecha(){
		return this.fecha;
	}

	
	public int getCantidadDeProductos() {
		// return (int) this.lista.size();
		return (int) this.productos.stream().count();
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	
}
