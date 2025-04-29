package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

	// Declaraciones
	Pedido p;
	Producto prod;
	PagoAlContado pago;
	EnvioExpress envio;
	CalculadoraDeDistancia c;
	Cliente cliente;
	
	Producto prod2;
	Producto prod3;
	
	Pedido pedido2;
	Pedido pedido3;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		this.c = new CalculadoraDeDistancia();
		this.prod = new Producto("Nombre", "Categoria", 100, 10);
		this.pago = new PagoAlContado();
		this.envio = new EnvioExpress(this.c);
		
		this.p = new Pedido(this.pago, this.envio, this.prod, 10);
		cliente = new Cliente("Nombre", "Direccion");
		
		this.prod2 = new Producto("Nombre", "Categoria2", 100, 10);
		this.prod3 = new Producto("Nombre", "Categoria2", 100, 10);
		
		this.pedido2 = new Pedido(this.pago, this.envio, this.prod2, 10);
		this.pedido3 = new Pedido(this.pago, this.envio, this.prod2, 10);

	}
	
	// Tests
	@Test
	void testCrearPedido() {
		// caso extremo donde se quiere hacer pedido de la cant limite de unidades disponibles
		assertTrue(this.cliente.crearPedido(this.pago, this.envio, this.prod, 10));
		
		// caso donde se quiere hacer pedido de cant mayor a unidades disponibles
		assertFalse(this.cliente.crearPedido(this.pago, this.envio, this.prod, 11));

	}
	
	@Test
	void testGetCategoriaDeProductos() {
		this.cliente.crearPedido(this.pago, this.envio, this.prod, 10);
		this.cliente.crearPedido(this.pago, this.envio, this.prod2, 10);
		this.cliente.crearPedido(this.pago, this.envio, this.prod2, 10);
		
		Map<String, Long> mapa = new HashMap<String, Long>();
		mapa = this.cliente.getCategoriasDeProductos();
		
		assertEquals(1, mapa.get("Categoria"));
		assertEquals(2, mapa.get("Categoria2"));

	}
	
	//@Test
	//void testConsultarCostoPedido() {	
		//this.cliente.agregarPedido(p);
		//this.cliente.agregarPedido(pedido2);
		//assertEquals(150, this.cliente.consultarCostoPedido(p));
		//assertEquals(150, this.cliente.consultarCostoPedido(pedido2));
		
		// pedido que no fue pedido x cliente
		//assertEquals(0, this.cliente.consultarCostoPedido(pedido3));
	//}
	
	
}
