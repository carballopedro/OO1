package ar.edu.unlp.info.oo1.ejercicio11_inversor;

public class InversionEnAcciones implements Inversion {

	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}
	
	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}
