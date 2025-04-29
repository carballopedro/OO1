package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class PrismaRectangularTest {

	// Declaraciones
	protected PrismaRectangular prisma;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		prisma = new PrismaRectangular(8, 5, 10, "Vidrio", "Transparente");
	}
	
	@Test
	void testGetVolumen() {
		assertEquals(8 * 5 * 10, prisma.getVolumen());
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(2 * (8 * 5 + 8 * 10 + 5 * 10), prisma.getSuperficie());
	}

}
