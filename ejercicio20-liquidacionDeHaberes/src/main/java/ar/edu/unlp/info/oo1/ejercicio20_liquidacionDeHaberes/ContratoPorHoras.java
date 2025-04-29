package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPorHoras extends Contrato {

	private double valorPorHora;
	private int horasPorMes;
	private LocalDate fechaFin;
	
	// constructor
	public ContratoPorHoras(LocalDate fechaInicio, double valorPorHora, int horasPorMes, LocalDate fechaFin) {
		// llama a constructor de Contrato
		super(fechaInicio);
		
		// variables privadas
		this.valorPorHora = valorPorHora;
		this.horasPorMes = horasPorMes;
		this.fechaFin = fechaFin;
	}
	
	// DEVUELVE DURACION DE CONTRATO
	// dias entre fecha inicio y fecha fin si no esta activo
	// dias entre fecha inicio y fecha actual si esta activo
	// se usa para calcular antiguedad x eso no se cuenta mas alla del dia de la fecha
	public int calcularDuracionContrato() {
		return (this.estaActivo()? (int) ChronoUnit.DAYS.between(this.getFechaInicio(), LocalDate.now()):
				(int) ChronoUnit.DAYS.between(this.getFechaInicio(), this.fechaFin));
	}
	
	// DEVUELVE SUELDO BASICO DEL CONTRATO
	// ContratoPorHoras: el monto a cobrar es el valor-hora acordado multiplicado por el número de horas que trabaja por mes.
	public double calcularSueldoBasico() {
		return this.valorPorHora * this.horasPorMes;
	}
	
	// devuelve si esta o no activo (boolean)
	// contrato activo si su fecha fin es posterior a la fecha actual
	public boolean estaActivo() {
		return this.fechaFin.isAfter(LocalDate.now());
	}
	
	
	// devuelve el contrato si esta vigente, null en caso contrario
	public Contrato estaVigente() {
		if (this.estaActivo()){
			return this;
		}
		return null;
	}
}
