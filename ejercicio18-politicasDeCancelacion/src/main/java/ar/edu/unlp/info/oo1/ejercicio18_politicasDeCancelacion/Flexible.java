package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion {

	// Reembolsa el monto total sin importar la fecha de cancelación (que de todas maneras debe ser anterior a la fecha de inicio de la reserva). 
	public double cancelacion(double montoTotal, LocalDate fechaInicial) {
		return montoTotal;
	}

}
