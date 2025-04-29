package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import java.time.LocalDate;

public class Estricta implements PoliticaCancelacion {

	// No reembolsará nada (0, cero) sin importar la fecha tentativa de cancelación.  
	public double cancelacion(double montoTotal, LocalDate fechaInicial) {
		return 0;
	}

}
