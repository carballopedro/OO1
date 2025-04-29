package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaCancelacion {

	// Reembolsa el monto total si la cancelación se hace hasta una semana antes y 50% si se hace hasta 2 días antes.
	public double cancelacion(double montoTotal, LocalDate fechaInicial) {
		int daysBetween = (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaInicial);
		return (daysBetween >= 7)? montoTotal : ((daysBetween >= 2)? (montoTotal * 0.5) : 0);
	}
}
