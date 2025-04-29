package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import java.time.LocalDate;

public interface PoliticaCancelacion {
	
	public double cancelacion(double montoTotal, LocalDate fechaInicial);
}
