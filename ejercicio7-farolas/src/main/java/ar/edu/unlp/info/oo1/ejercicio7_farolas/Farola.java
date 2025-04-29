package ar.edu.unlp.info.oo1.ejercicio7_farolas;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private boolean estado;
	private List<Farola> neighbors;
	// tengo que instanciar como List en vez de ArrayList?
	
	// Constructor
	public Farola() {
		this.estado = false;
		this.neighbors = new ArrayList<Farola>();
	}
	
	// Devuelve true si la farola está encendida
	public boolean isOn() {
		return this.estado;
	}
	
	// Devuelve true si la farola está apagada
	public boolean isOff() {
		return !this.estado;
	}
	
	// Si la farola está apagada, la enciende a ella y a toda su red
	public void turnOn() {
		if (this.isOff()) {
		this.estado = true;
		this.neighbors.stream().forEach(Farola::turnOn);
		// otra opción: this.neighbors.stream().forEach(farola -> farola.turnOn());
		}
	}
	
	// Si la farola está encendida, la apaga a ella y a toda su red
	public void turnOff(){
		if (this.isOn()) {
		this.estado = false;
		this.neighbors.stream().forEach(Farola::turnOff);
		}
	}
	
	// Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es
	// decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en
	// vecina del receptor del mensaje
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.neighbors.contains(otraFarola)) {
			this.agregarFarola(otraFarola);;
			otraFarola.agregarFarola(this);
		}
	}
	
	public void agregarFarola(Farola otraFarola) {
		this.neighbors.add(otraFarola);
	}
	
	public List<Farola> getNeighbors() {
		return this.neighbors;
	}
	
}
