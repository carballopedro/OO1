package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioExpressTest {

	// Declaraciones
	EnvioExpress e;
	CalculadoraDeDistancia c;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		this.c = new CalculadoraDeDistancia();
		this.e = new EnvioExpress(this.c);
	}
	
	@Test
	void testGetCostoDeEnvio() {
		assertEquals(50, this.e.getCostoDeEnvio("Origen", "Destino"));
	}
}
