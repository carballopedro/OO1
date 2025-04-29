package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsferaTest {

	// Declaraciones
	protected Esfera esfera;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		esfera = new Esfera(3, "Plata", "Plateada");
	}
	
	// Tests
	@Test
	void testGetVolumen() {
		assertEquals((4/3) * Math.PI * Math.pow(3, 3), esfera.getVolumen());
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(4 * Math.PI * Math.pow(3, 2), esfera.getSuperficie());
	}

}
