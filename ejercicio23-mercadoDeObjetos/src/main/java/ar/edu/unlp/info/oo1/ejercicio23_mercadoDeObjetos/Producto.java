package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class Producto {

	private String nombre;
	private String categoria;
	private double precio;
	private int cantDisponible;
	
	public Producto (String nombre, String categoria, double precio, int cantDisponible) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantDisponible = cantDisponible;
	}
	
	public boolean estaDisponible(int cant) {
		return cant <= cantDisponible;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
