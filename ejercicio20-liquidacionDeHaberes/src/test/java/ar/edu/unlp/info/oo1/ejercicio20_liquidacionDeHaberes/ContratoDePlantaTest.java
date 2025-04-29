package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContratoDePlantaTest {

	// Declaraciones
	ContratoDePlanta c;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2024, 11, 01);
		this.c = new ContratoDePlanta(fecha, 20, 10, 10);
	}
	
	@Test
	void testCalcularDuracionContrato() {
		// se prubea test el 4 de noviembre
		assertEquals(3, this.c.calcularDuracionContrato());
	}
	
	@Test
	void testCalcularSueldoBasico() {
		assertEquals(40, this.c.calcularSueldoBasico());
	}
}
