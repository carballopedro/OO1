package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlazoFijoTest {

	protected PlazoFijo plazoFijo;
	
	@BeforeEach
	void setUp() {
    	plazoFijo = new PlazoFijo(LocalDate.now(), 3000, 0.01);

	}
	
	@Test
	void valorActual() {
		assertEquals(3000, plazoFijo.valorActual());
	}

}
