package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	// constructor
	public PlazoFijo (LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	// calcula cantidad de dias entre fechaDeConstitucion y fecha actual
	// devuelve el monto depositado + (el interes diario * cant de dias * el monto depositado)
	// porcentaje 1% guardado como 0.01
	public double valorActual() {
		int cantDias = (int) ChronoUnit.DAYS.between(LocalDate.now(), this.fechaDeConstitucion);
		return this.montoDepositado + (cantDias * (this.montoDepositado * this.porcentajeDeInteresDiario));
	}
}
