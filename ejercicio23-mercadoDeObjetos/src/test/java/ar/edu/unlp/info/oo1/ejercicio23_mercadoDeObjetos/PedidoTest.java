package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	
	// Declaraciones
	Pedido p;
	Producto prod;
	PagoAlContado pago;
	EnvioExpress envio;
	CalculadoraDeDistancia c;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		this.c = new CalculadoraDeDistancia();
		this.prod = new Producto("Nombre", "Categoria", 100, 10);
		this.pago = new PagoAlContado();
		this.envio = new EnvioExpress(this.c);
		
		this.p = new Pedido(this.pago, this.envio, this.prod, 10);
	}
	
	@Test
	void testCalcularCostoTotal() {
		assertEquals(150, this.p.calcularCostoTotal("Destino"));
	}
}
