package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoDePlanta extends Contrato {

	private double sueldoMensual;
	private double montoPorConyuge;
	private double montoPorHijos;
	
	// constructor
	public ContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, double montoPorConyuge, double montoPorHijos) {
		// llama al constructor de Contrato
		super(fechaInicio);
		
		// variables privadas
		this.sueldoMensual = sueldoMensual;
		
		// si no tiene conyuge y/o hijos se pasa 0 como parametro en el constructor
		this.montoPorConyuge = montoPorConyuge;
		this.montoPorHijos = montoPorHijos;
	}
	
	// DEVUELVE DURACION DE CONTRATO
	// dias entre fecha inicio y fecha actual
	public int calcularDuracionContrato() {
		return (int) ChronoUnit.DAYS.between(this.getFechaInicio(), LocalDate.now());
	}
	
	// DEVUELVE SUELDO BASICO DEL CONTRATO
	// ContratoDePlanta: el monto a cobrar es el sueldo mensual acordado, más el monto acordado por tener cónyuge a cargo (si es que tiene cónyuge a cargo), más el monto acordado por tener hijos a cargo (si es que tiene hijos a cargo).
	public double calcularSueldoBasico() {
		return  this.sueldoMensual + this.montoPorConyuge + this.montoPorHijos;
	}
	
	// DEVUELVE EL CONTRATO
	// siempre estan activos
	public Contrato estaVigente() {
		return this;
	}
	
	public boolean estaActivo() {
		return true;
	}
}
