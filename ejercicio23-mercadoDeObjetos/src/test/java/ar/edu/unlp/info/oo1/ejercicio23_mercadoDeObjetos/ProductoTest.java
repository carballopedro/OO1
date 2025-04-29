package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {

	// Declaraciones
	Producto p;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		this.p = new Producto("Nombre", "Categoria", 100, 10);
	}
	
	@Test
	void testEstaDisponible() {
		// caso extremo producto disponible cantdisponible = cant pasada x parametro
		assertTrue(this.p.estaDisponible(10));
		
		// caso donde se pide mas de la cantdisponible
		assertFalse(this.p.estaDisponible(11));
	}
	
}
