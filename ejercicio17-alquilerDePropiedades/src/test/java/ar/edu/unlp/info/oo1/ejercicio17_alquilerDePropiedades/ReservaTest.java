package ar.edu.unlp.info.oo1.ejercicio17_alquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {

	// Declaraciones
	DateLapse date;
	DateLapse date2;
	DateLapse date3;
	DateLapse date4;
	
	Reserva reserva;
	Reserva reserva2;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate from = LocalDate.of(2023, 01, 01);
		LocalDate to = LocalDate.of(2023, 01, 31);
		date = new DateLapse(from, to);
		
		LocalDate from1 = LocalDate.of(2023, 01, 01);
		LocalDate to1 = LocalDate.of(2023, 01, 31);
		reserva = new Reserva(from1, to1, 10);
		
		LocalDate from6 = LocalDate.of(2023, 01, 01);
		LocalDate to6 = LocalDate.of(2025, 01, 31);
		reserva2 = new Reserva(from6, to6, 10);
		
	}
	
	// Tests
	@Test
	void testCalcularPrecio() {
		// cant de noches entre 01/01/2023 y 31/01/2023 = 30 * 10 (precio por noche)
		assertEquals(300, this.reserva.calcularPrecio());
	}
	

	@Test
	void testSeSuperpone() {
		
		LocalDate from2 = LocalDate.of(2024, 01, 01);
		LocalDate to2 = LocalDate.of(2026, 01, 31);
		// reserva no se superpone con date
		assertFalse(this.reserva.seSuperpone(from2, to2));
		
		LocalDate from3 = LocalDate.of(2023, 01, 31);
		LocalDate to3 = LocalDate.of(2024, 01, 31);
		// reserva se superpone con date
		assertTrue(this.reserva.seSuperpone(from3, to3));
	}
	
	@Test
	void testEstaEntre() {
		LocalDate from4 = LocalDate.of(2023, 01, 31);
		LocalDate to4 = LocalDate.of(2024, 01, 31);
		// reserva no esta dentro de date
		assertFalse(this.reserva.estaEntre(from4, to4));
		
		LocalDate from5 = LocalDate.of(2023, 01, 01);
		LocalDate to5 = LocalDate.of(2026, 01, 31);
		// reserva esta dentro de date
		assertTrue(this.reserva.estaEntre(from5, to5));
	}
	
	@Test
	void testEstaEnCurso() {
		// reserva no esta en curso
		assertFalse(this.reserva.estaEnCurso());
		
		// reserva2 esta en curso
		assertTrue(this.reserva2.estaEnCurso());
	}
}
