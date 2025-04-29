package ar.edu.unlp.info.oo1.ejercicio14b_intervaloDeTiempoConInterfaz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapse1Test {

	// Declaraciones
	DateLapse1 date;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate from = LocalDate.of(2023, 01, 01);
		LocalDate to = LocalDate.of(2023, 01, 31);
		date = new DateLapse1(from, to);
	}
	
	// Tests
	@Test
	void testSizeInDays() {
		// 30 es la cant de días entre to y from
		assertEquals(30, this.date.sizeInDays());
	}
	
	@Test
	void testIncludesDate() {
		LocalDate fecha = LocalDate.of(2023, 01, 15);
		LocalDate fecha2 = LocalDate.of(2023, 03, 15);

		// fecha está entre to y from
		assertTrue(this.date.includesDate(fecha));
		
		// fecha2 no está entre to y from
		assertFalse(this.date.includesDate(fecha2));
	}
}
