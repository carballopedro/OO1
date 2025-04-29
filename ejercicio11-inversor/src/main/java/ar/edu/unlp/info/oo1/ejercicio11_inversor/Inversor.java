package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import java.util.List;
import java.util.ArrayList;

public class Inversor {
	
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor (String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public void agregarInversion (Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(Inversion::valorActual).sum();
	}
}
