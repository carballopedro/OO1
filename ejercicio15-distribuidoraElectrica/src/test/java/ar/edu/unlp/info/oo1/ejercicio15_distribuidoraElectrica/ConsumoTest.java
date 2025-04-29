package ar.edu.unlp.info.oo1.ejercicio15_distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsumoTest {

	// Declaraciones
	Consumo consumo;
	Consumo consumo2;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		consumo = new Consumo(100,10);
		consumo2 = new Consumo(10,10);
	}
	
	// Tests
	@Test
	void testFactorDePotencia() {
		//debe devolver consumoEnergiaActiva / Math.sqrt (Math.pow(consumoEnergiaActiva, 2) + Math.pow(consumoEnergiaReactiva, 2));
		assertEquals(0.995 ,this.consumo.factorDePotencia(), 0.001);
	}
	
	@Test
	void testBonificacion() {
		// 0.995 > 0.8
		assertTrue(this.consumo.bonificacion());
		
		// 0.707 < 0.8
		assertFalse(this.consumo2.bonificacion());
		
		}
}
