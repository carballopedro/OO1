package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContratoPorHorasTest {

	// Declaraciones
	ContratoPorHoras c;
	ContratoPorHoras c2;

	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2024, 11, 01);
		LocalDate fecha2 = LocalDate.of(2025, 11, 01);
		this.c = new ContratoPorHoras(fecha, 20, 100, fecha2);
		
		LocalDate fecha3 = LocalDate.of(2023, 11, 01);

		this.c2 = new ContratoPorHoras(fecha3, 200, 100, fecha);

	}
	
	@Test
	void testCalcularDuracionDeContrato() {
		assertEquals(3, this.c.calcularDuracionContrato());
		assertEquals(366, this.c2.calcularDuracionContrato());
	}
	
	@Test
	void testCalcularSueldoBasico() {
		assertEquals(2000, this.c.calcularSueldoBasico());
		assertEquals(20000, this.c2.calcularSueldoBasico());
	}
	
	@Test
	void testEstaActivo() {
		// esta activo
		assertTrue(this.c.estaActivo());
		// no esta activo
		assertFalse(this.c2.estaActivo());
	}
	
	// estaVigente no es necesario probarlo es basicamente lo mismo que estaActivo
}
