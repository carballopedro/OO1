package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {

	// Declaraciones
	Propiedad p2;
	
	Reserva r2;
	Reserva r3;
	Reserva r4;
	
	PoliticaCancelacion p;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		p = new Moderada();
		p2 = new Propiedad("Direccion", "Nombre", 10, p);
		
		
		LocalDate from7 = LocalDate.of(2025, 01, 01);
		LocalDate to7 = LocalDate.of(2025, 01, 31);
		r2 = new Reserva(from7, to7, 10);
		
		LocalDate from8 = LocalDate.of(2024, 11, 04);
		LocalDate to8 = LocalDate.of(2024, 11, 14);
		r3 = new Reserva(from8, to8, 10);
		
		LocalDate from9 = LocalDate.of(2024, 11, 01);
		LocalDate to9 = LocalDate.of(2024, 11, 14);
		r4 = new Reserva(from9, to9, 10);

	}
	
	// Tests
	
	@Test
	void testCancelarReserva() {
		// se cancela mas de una semana antes : se devuelve todo el monto
		assertEquals(300, this.p2.cancelarReserva(r2));
		
		// se cancela entre 2 y 7 dias antes (SE TESTEO EL DIA 31 DE NOVIEMBRE) : se devuelve la mitad del monto
		assertEquals(50, this.p2.cancelarReserva(r3));
		
		// se cancela 1 dia antes : no se devuelve nada
		assertEquals(0, this.p2.cancelarReserva(r4));

	}
	
}
