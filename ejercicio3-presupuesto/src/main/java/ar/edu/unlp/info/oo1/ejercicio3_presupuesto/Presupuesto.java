package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
	
	/*
	 * Definición de variables
	 */
	
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	/*
	 * Constructor
	 */
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	/*
	 * Stream me permite iterar sobre todos los elementos de una lista (como un for) y  me permite aplicarle funciones
	 */
	
	public double calcularTotal(){
		return this.items.stream().mapToDouble(item -> item.costo()).sum();
		}
			
	/*
	 * Getters
	 */
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
}
