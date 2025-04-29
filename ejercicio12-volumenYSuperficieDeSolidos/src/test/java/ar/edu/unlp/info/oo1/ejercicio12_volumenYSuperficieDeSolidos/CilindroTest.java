package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CilindroTest {
	
	// Declaraciones
	protected Cilindro cilindro;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		cilindro = new Cilindro(10, 13, "Plastico", "Negro");
	}
	
	// Tests
	@Test
	void testGetVolumen() {
		assertEquals(Math.PI * Math.pow(10, 2) * 13, cilindro.getVolumen());
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals((2 * Math.PI * 10 * 13) + (2 * Math.PI * Math.pow(10, 2)), cilindro.getSuperficie());
	}

}
