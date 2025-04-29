package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import java.time.LocalDate;

public abstract class Contrato {
	
	private LocalDate fechaInicio;
	
	// sin fecha fin
	public Contrato(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	// devuelve fecha Inicio de contrato
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
	
	// metodos abstractos a implementar por clases ContratoPorHoras y ContratoDePlanta
	public abstract int calcularDuracionContrato();
	
	public abstract double calcularSueldoBasico();
	
	public abstract Contrato estaVigente();
	
	public abstract boolean estaActivo();
}

// esta clase no necesita test