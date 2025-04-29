package ar.edu.unlp.info.oo1.ejercicio24_poolCar;

import java.time.LocalDate;

public class Vehiculo {
	
	private Conductor conductor;
	private String descripcion;
	private int capacidad;
	private int añoFabricacion;
	private double valorMercado;
	
	public Vehiculo(String descripcion, int capacidad, int añoFabricacion, double valorMercado) {
		this.conductor = null;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.añoFabricacion = añoFabricacion;
		this.valorMercado = valorMercado;
	}
	
	public boolean asignarConductor(Conductor conductor) {
		if (this.conductor == null) {
			this.conductor = conductor;
			return true;
		}
		return false;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public Conductor getConductor() {
		return this.conductor;
	}
	
	public double getValorMercado() {
		return this.valorMercado;
	}
	
	public boolean menosDe5Años() {
		return (LocalDate.now().getYear() - this.añoFabricacion) < 5;
	}

}
