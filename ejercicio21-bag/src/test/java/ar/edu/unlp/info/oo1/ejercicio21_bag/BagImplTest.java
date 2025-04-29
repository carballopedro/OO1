package ar.edu.unlp.info.oo1.ejercicio21_bag;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BagImplTest {

	// Declaraciones
	BagImpl<String> b;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		this.b = new BagImpl<String>();
	}
	
	@Test
	void testAdd() {
		assertTrue(this.b.add("Pedro"));
		assertTrue(this.b.add("Pedro"));
	}
	
	@Test
	void testOccurrenceOf() {
		// caso de no existir en la bolsa
		assertEquals(0, this.b.occurrencesOf("Franco"));
		// caso de existir en la bolsa
		this.b.add("Franco");
		assertEquals(1, this.b.occurrencesOf("Franco"));
	}
	
	@Test
	void testRemoveAll() {
		// caso de intentar remover elemento de bolsa vacía 
		this.b.removeAll("Franco");

		// caso de remover varios
		this.b.add("Franco");
		this.b.add("Franco");
		assertEquals(2, this.b.occurrencesOf("Franco"));

		this.b.removeAll("Franco");
		assertEquals(0, this.b.occurrencesOf("Franco"));
	}
	
	@Test
	void testRemoveOccurrence() {
		// caso de intentar eliminar si no existe en la bolsa
		this.b.removeOccurrence("Franco");
		assertEquals(0, this.b.occurrencesOf("Franco"));
		
		// caso de eliminar si existe una solo en la bolsa
		this.b.add("Franco");
		this.b.removeOccurrence("Franco");
		assertEquals(0, this.b.occurrencesOf("Franco"));
		assertEquals(0, this.b.size());
		
		// caso de eliminar si existe en la bolsa
		this.b.add("Franco");
		this.b.add("Franco");
		this.b.removeOccurrence("Franco");
		assertEquals(1, this.b.occurrencesOf("Franco"));
		
	}
	
	@Test
	void testSize() {
		// caso de bolsa vacía
		assertEquals(0, this.b.size());
		
		// caso de bolsa con varios elementos
		this.b.add("Franco");
		this.b.add("Franco");
		this.b.add("Pedro");
		this.b.add("Pedro");
		assertEquals(4, this.b.size());
	}

}
