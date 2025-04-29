package ar.edu.unlp.info.oo1.ejercicio16_filteredSet;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenNumberSetTest {

	// Declaraciones
	EvenNumberSet number;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		number = new EvenNumberSet();
	}
	// Tests
	@Test
	void testAdd() {
		// true xq 2 es numero par
		assertTrue(this.number.add(2));
		
		// false xq 3 es numero impar
		assertFalse(this.number.add(3));
	}
}
