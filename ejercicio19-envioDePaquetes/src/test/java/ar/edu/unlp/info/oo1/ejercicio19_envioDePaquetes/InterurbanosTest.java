package ar.edu.unlp.info.oo1.ejercicio19_envioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterurbanosTest {

	// Declaraciones
	Interurbanos i;
	Interurbanos i2;
	Interurbanos i3;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2025, 01, 01);
		i = new Interurbanos(fecha, "Origen", "Destino", 10, 10);
		
		i2 = new Interurbanos(fecha, "Origen", "Destino", 10, 2000);
		
		i3 = new Interurbanos(fecha, "Origen", "Destino", 10, 70000);

	}
	
	// Tests
	@Test
	void testCalcularCosto() {
		
		// Los envíos interurbanos tienen un costo que depende de la distancia entre el origen y el destino
		// (utilice $20 para menos de 100 km por cada gramo de peso, $25 para distancias entre 100 km y 500 km 
		// por gramo de peso, y $30 para distancias de más de 500 km por gramo de peso). 
		
		// menos de 100km por cada gramo de peso
		assertEquals(20, this.i.calcularCosto());
		
		// entre 100 y 500km por cada gramo de peso
		assertEquals(25, this.i2.calcularCosto());
		
		// mas de 500km por cada gramo de peso
		assertEquals(30, this.i3.calcularCosto());
		
		
	}

}
