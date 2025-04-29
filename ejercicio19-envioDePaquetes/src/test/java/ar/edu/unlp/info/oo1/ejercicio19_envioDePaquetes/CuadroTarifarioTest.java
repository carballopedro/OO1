package ar.edu.unlp.info.oo1.ejercicio19_envioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadroTarifarioTest {

	// Declaraciones
	CuadroTarifario cuadro;
	Pais p1;
	Pais p2;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		cuadro = new CuadroTarifario();
		
		p1 = new Pais("Brasil", 10);
		p2 = new Pais("Chile", 5);
		
		cuadro.addTarifa(p1);
		cuadro.addTarifa(p2);
	}
	
	// Tests
	@Test
	void calcularCostoPais() {
		// costo brasil 10
		assertEquals(10, this.cuadro.calculaCostoPais("Brasil"));
		
		// costo chile 5
		assertEquals(5, this.cuadro.calculaCostoPais("Chile"));
		
		// uruguay no esta en la lista asi que su costo es 0
		assertEquals(0, this.cuadro.calculaCostoPais("Uruguay"));


	}
	
}
