package ar.edu.unlp.info.oo1.ejercicio17_alquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {

	// Declaraciones
	DateLapse date;
	DateLapse date2;
	DateLapse date3;
	DateLapse date4;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate from = LocalDate.of(2023, 01, 01);
		LocalDate to = LocalDate.of(2023, 01, 31);
		date = new DateLapse(from, to);
		
		
		LocalDate from2 = LocalDate.of(2024, 01, 01);
		LocalDate to2 = LocalDate.of(2026, 01, 31);
		date2 = new DateLapse(from2, to2);
		
		LocalDate from3 = LocalDate.of(2023, 01, 31);
		LocalDate to3 = LocalDate.of(2026, 01, 31);
		date3 = new DateLapse(from3, to3);
		
		LocalDate from4 = LocalDate.of(2023, 01, 31);
		LocalDate to4 = LocalDate.of(2024, 01, 31);
		date4 = new DateLapse(from4, to4);
		
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
	
	@Test
	void testOverlaps() {
		// date2 no se superpone con date
		assertFalse(this.date2.overlaps(date));
		
		// date3 se superpone con date
		assertTrue(this.date3.overlaps(date));
	}
	
	@Test
	void testEstaEntre() {
		// date3 no esta dentro de date
		assertFalse(this.date3.estaEntre(date));
		
		// date4 esta dentro de date3
		assertTrue(this.date4.estaEntre(date3));
	}
	
	@Test
	void testEstaEnCurso() {
		// no esta en curso
		assertFalse(this.date.estaEnCurso());
		
		// esta en curso
		assertTrue(this.date2.estaEnCurso());
	}
	
}
