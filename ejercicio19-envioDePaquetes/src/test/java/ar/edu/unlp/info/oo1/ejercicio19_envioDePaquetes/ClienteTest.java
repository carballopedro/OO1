package ar.edu.unlp.info.oo1.ejercicio19_envioDePaquetes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

	// Declaraciones
	Cliente c;
	Locales l;
	Interurbanos i;
	Internacionales inter;
	
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		LocalDate fecha = LocalDate.of(2025, 01, 01);
		l = new Locales(fecha, "Origen", "Destino", 10, true);
		
		i = new Interurbanos(fecha, "Origen", "Destino", 10, 10);
		
		inter = new Internacionales(fecha, "Origen", "Destino", 500);
		
		c = new Individuo("Nombre", "Direccion", 43239475);
		c.addEnvio(l);
		c.addEnvio(i);
		c.addEnvio(inter);		
		
	}
	
	// Tests
	@Test
	void testMontoAPagar() {
		LocalDate fecha2 = LocalDate.of(2024, 01, 01);
		LocalDate fecha3 = LocalDate.of(2026, 01, 01);

		// monto de l = 1500
		// monto de i = 20
		// mpnto de inter = 10000
		// monto a pagar es 1500 + 20 + 10000 = 11520 (eso lo multiplico por 0.9 ya que es el 10% descuento al individuo) = 10368
		assertEquals(10368, this.c.montoAPagar(fecha2, fecha3));
	}
}
