package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

public class Item {

	/*
	 * Definición de variables
	 */

	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public double costo() {
		return this.cantidad * this.costoUnitario;
	}
	
	
	/*
	 * Getters
	 */
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	/*
	 * Constructor
	 */
	
	
	public Item (String detalle, int cantidad, Double costoUnitario) {
		this.detalle = detalle;
		this.costoUnitario = costoUnitario;
		this.cantidad = cantidad;
	}

	
}
