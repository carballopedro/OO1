package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModeradaTest {
	// Declaraciones
	Moderada m;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		m = new Moderada();
	}
	
	// Tests
	@Test
	void testCancelacion() {
		// se cancela mas de una semana antes : se devuelve todo el monto
		LocalDate fecha = LocalDate.of(2025, 01, 01);
		assertEquals(10, this.m.cancelacion(10, fecha));
		
		// se cancela entre 2 y 7 dias antes (SE TESTEO EL DIA 31 DE NOVIEMBRE) : se devuelve la mitad del monto
		LocalDate fecha2 = LocalDate.of(2024, 11, 04);
		assertEquals(5, this.m.cancelacion(10, fecha2));
		
		// se cancela 1 dia antes : no se devuelve nada
		LocalDate fecha3 = LocalDate.of(2024, 11, 01);
		assertEquals(0, this.m.cancelacion(10, fecha3));
	}
	
}
