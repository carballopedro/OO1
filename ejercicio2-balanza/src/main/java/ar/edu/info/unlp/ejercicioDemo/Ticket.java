package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Ticket {

	/*
	 * Definición de variables
	 */
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	/*
	 * Constructor
	 */
	
	public Ticket(int cant, double precio, double peso) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cant;
		this.pesoTotal = peso;
		this.precioTotal = precio;
	}
	
	/*
	 * Getters
	 */
	
	public Double impuesto() {
		return this.precioTotal * 0.21;
	}
	
	public LocalDate getFecha(){
		return this.fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}

	
}
