package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedicoTest {

	// Declaraciones
	Medico m;
	Medico m2;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2020, 10, 10);
		m = new Medico("Pedro", fecha, 100);
		
		LocalDate fecha2 = LocalDate.of(2024, 11, 10);
		m2 = new Medico("Juan", fecha2, 100);
		
	}
	
	// Tests
	
	@Test
	void testAntiguedad() {
		// 4 años de antiguedad
		assertEquals(4, this.m.antiguedad());
		
		// sin antiguedad
		assertEquals(0, this.m2.antiguedad());
	}
}
