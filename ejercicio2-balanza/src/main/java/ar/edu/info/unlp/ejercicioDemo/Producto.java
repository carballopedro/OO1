package ar.edu.info.unlp.ejercicioDemo;

public class Producto {
	
	/*
	 * Definición de variables
	 */
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	/*
	 * constructor
	 */
	public Producto() {
		this.peso = 0;
		this.precioPorKilo = 0;
		this.descripcion ="";
	}
	
	/*
	 * Getters
	 */
	
	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	
	/*
	 * Setters
	 */
	
	public void setPeso(double p) {
		this.peso = p;
	}
	
	public void setPrecioPorKilo(double p) {
		this.precioPorKilo = p;
	}
	
	public void setDescripcion(String s) {
		this.descripcion = s;
	}
	
}
