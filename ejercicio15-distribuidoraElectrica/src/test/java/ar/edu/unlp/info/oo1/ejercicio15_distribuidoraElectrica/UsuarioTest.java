package ar.edu.unlp.info.oo1.ejercicio15_distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

	// Declaraciones
	Usuario usuario;
	CuadroTarifario cuadro;
	Consumo consumo1;
	Consumo consumo2;
	Consumo consumo3;

	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		usuario = new Usuario("Nombre", "Domicilio");
		cuadro = new CuadroTarifario(10);
		this.usuario.setCuadro(cuadro);
		
		consumo1 = new Consumo(100,10);
		consumo2 = new Consumo(10,10);
		
		this.usuario.addConsumo(consumo1);
		this.usuario.addConsumo(consumo2);
		
		consumo3 = new Consumo(100,10);		
	}
	
	// Tests
	@Test
	void testGetCostoConsumo() {
		// costo consumo = 100 = energia activa del ultimo consumo (10) * precioKwh del cuadro (10)
		assertEquals(100, this.usuario.getCostoConsumo());
	}
	
	@Test
	void testObtieneBonificacion() {
		
		// factor de potencia del ultimo consumo es 0.707 < 0.8, x lo tanto devuelve falso
		assertFalse(this.usuario.obtieneBonificacion());
		
		// se agrega consumo
		this.usuario.addConsumo(consumo3);
		
		// factor de potencia del ultimo consumo es 0.995 < 0.8, x lo tanto devuelve falso
		assertTrue(this.usuario.obtieneBonificacion());
	}
	
	@Test
	void testEmitirFactura() {
		
		// sin bonificacion
		Factura f = this.usuario.emitirFactura();
		// costoConsumo f = 100
		// bonificacion = 0
		// monto total = 100
		assertEquals(0, f.getBonificacion());
		assertEquals(100, f.getMontoFinal());
		
		// se agrega consumo
		this.usuario.addConsumo(consumo3);
		
		// con bonificacion
		Factura f2 = this.usuario.emitirFactura();
		// costoConsumo f2 = 1000
		// bonificacion = 1000 * 0.10 = 100
		// monto total = 1000 - 100 = 900
		assertEquals(100, f2.getBonificacion());
		assertEquals(900, f2.getMontoFinal());
		
		
		
	}
		

}
