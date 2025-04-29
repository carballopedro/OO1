package ar.edu.unlp.info.oo1.ejercicio19_envioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InternacionalesTest {

	// Declaraciones
	Internacionales i;
	Internacionales i2;
	CuadroTarifario c;
	Pais p;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2025, 01, 01);
		i = new Internacionales(fecha, "Origen", "Destino", 500);
		
		i2 = new Internacionales(fecha, "Origen", "Destino", 3000);
		
		p = new Pais("Destino", 1000);
		
		c = new CuadroTarifario();
		c.addTarifa(p);
	}
	
	// Tests
	@Test
	void testCalcularCosto() {

		// peso en kg menor a 1
		assertEquals(10000, this.i.calcularCosto());
		
		// peso en kg mayor a 1
		assertEquals(41000, this.i2.calcularCosto());
	}
	
	@Test
	void testCalcularCostoTarifario() {
		
		// peso en kg menor a 1
		assertEquals(6000, this.i.calcularCostoConCuadroTarifario(c));
				
		// peso en kg mayor a 1
		assertEquals(37000, this.i2.calcularCostoConCuadroTarifario(c));
	}
	
	
	

}
