package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {

	// Declaraciones
	Archivo archivo;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		this.archivo = new Archivo("Nombre");
	}
	
	// test del método tamaño
	@Test
	void testTamaño() {
		assertEquals(6, this.archivo.tamaño());
	}
}
