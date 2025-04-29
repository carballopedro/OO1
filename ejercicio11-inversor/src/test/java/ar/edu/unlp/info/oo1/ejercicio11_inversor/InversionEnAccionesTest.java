package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {

	protected InversionEnAcciones inversionEnAcciones;
	
	@BeforeEach
	void setUp() {
    	inversionEnAcciones = new InversionEnAcciones("Nombre", 100, 300);

	}
	
	@Test
	void valorActual() {
		assertEquals(30000, inversionEnAcciones.valorActual());
	}

}
