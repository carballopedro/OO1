package ar.edu.unlp.info.oo1.ejercicio19_envioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LocalesTest {
	

	// Declaraciones
	Locales l;
	Locales l2;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2025, 01, 01);
		l = new Locales(fecha, "Origen", "Destino", 10, true);
		
		l2 = new Locales(fecha, "Origen", "Destino", 10, false);
	}
	
	// Tests
	@Test
	void testCalcularCosto() {
		
		// entrega rapida costo 1500
		assertEquals(1500, this.l.calcularCosto());
		
		// entrega estandar costo 1000
		assertEquals(1000, this.l2.calcularCosto());
	}


}
