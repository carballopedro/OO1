package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

	// Declaraciones
	Empleado e;
	Empleado e2;
	Empleado e3;
	
	ContratoPorHoras c;
	ContratoPorHoras c2;
	
	ContratoDePlanta c3;

	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(1998, 04, 8);
		this.e = new Empleado("Pedro", "Carballo", "20-41670824-0", fecha, false);
		
		LocalDate fecha2 = LocalDate.of(1994, 05, 24);
		this.e2 = new Empleado("Juan", "Perez", "20-43562945-0", fecha, true);
		
		LocalDate fecha7 = LocalDate.of(1998, 04, 8);
		this.e3 = new Empleado("Franco", "Colapinto", "20-45940392-0", fecha, false);
		
		LocalDate fecha3 = LocalDate.of(2024, 11, 01);
		LocalDate fecha4 = LocalDate.of(2025, 11, 01);
		this.c = new ContratoPorHoras(fecha3, 20, 100, fecha4);
		
		LocalDate fecha5 = LocalDate.of(2023, 11, 01);

		this.c2 = new ContratoPorHoras(fecha5, 200, 100, fecha3);
		
		LocalDate fecha6 = LocalDate.of(2024, 11, 01);
		this.c3 = new ContratoDePlanta(fecha6, 20, 10, 10);
	
		// contrato no vigente
		this.e.agregarContrato(c2);
		// contrato vigente
		this.e.agregarContrato(c);
		
		// contrato no vigente
		this.e2.agregarContrato(c2);
		// contrato vigente
		this.e2.agregarContrato(c3);
		
	}
	
	// Tests
	@Test
	void testAgregarContrato() {
		// ya tiene contrato vigente
		assertFalse(this.e.agregarContrato(c));

		// no tiene contrato vigente
		assertTrue(this.e3.agregarContrato(c));
	}
	
	@Test
	void testContratoVigente() {
		// casos con contratos vigentes
		assertEquals(c, this.e.contratoVigente());
		assertEquals(c3, this.e2.contratoVigente());
		// caso de empleado sin contrato vigente
		assertEquals(null, this.e3.contratoVigente());
	}
	
	@Test
	void testCalcularAntiguedad() {
		// el test se realiza el dia de la fecha 4 de noviembre de 2024
		assertEquals(369, this.e.calcularAntiguedad());
		
	    //assertEquals(, this.e.calcularAntiguedad());
		assertEquals(0, this.e3.calcularAntiguedad());
	}
	
	@Test
	void testCalcularSueldoBasico() {
		// casos con contratos vigentes
		assertEquals(2000, this.e.calcularSueldoBasico());
		assertEquals(40, this.e2.calcularSueldoBasico());
		// caso empleado sin contrato vigente
		assertEquals(0, this.e3.calcularSueldoBasico());
	}
	
	
	@Test
	void testCalcularAdicional() {
		// caso con antiguedad >= a 20
		assertEquals(2000, this.e.calcularAdicional());
		// caso con antiguedad 0
		assertEquals(0, this.e3.calcularAdicional());
	}
	
	@Test
	void testCalcularMontoTotal() {
		// caso con sueldo basico 2000 y valor adicional 2000
		assertEquals(4000, this.e.calcularMontoTotal());
		// caso con sueldo basico y adicional 0
		assertEquals(0, this.e3.calcularMontoTotal());
	}
	
	
	@Test
	void testGenerarReciboDeSueldo() {
		// caso empleado sin contrato vigente
		assertEquals(null, this.e3.generarReciboDeSueldo());
		
		// caso empleado con contrato vigente
		ReciboDeSueldo r = e.generarReciboDeSueldo();
		assertEquals("Pedro", r.getNombre());
		assertEquals("Carballo", r.getApellido());
		assertEquals("20-41670824-0", r.getCuil());
		assertEquals(369, r.getAntiguedad());
		assertEquals(4000, r.getMontoTotal());
	}
}
