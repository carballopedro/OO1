package ar.edu.unlp.info.oo1.ejercicio19_envioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioTest {

	// Declaraciones
	Locales l;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2025, 01, 01);
		l = new Locales(fecha, "Origen", "Destino", 10, true);
	}
	
	// Tests
	@Test
	void testSeConsidera() {
		// envio esta entre fechas (se prueba caso en el borde)
		LocalDate fecha1 = LocalDate.of(2025, 01, 01);
		LocalDate fecha2 = LocalDate.of(2026, 01, 01);
		assertTrue(this.l.seConsidera(fecha1, fecha2));
		
		// envio no esta entre fechas
		LocalDate fecha3 = LocalDate.of(2027, 01, 01);
		LocalDate fecha4 = LocalDate.of(2028, 01, 01);
		assertFalse(this.l.seConsidera(fecha3, fecha4));

	}
	
}
