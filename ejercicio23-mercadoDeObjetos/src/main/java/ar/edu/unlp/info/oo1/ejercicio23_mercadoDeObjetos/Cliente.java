package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cliente extends Persona {

	private List<Pedido> pedidos;
	
	public Cliente (String nombre, String direccion) {
		super(nombre, direccion);
		this.pedidos = new ArrayList<Pedido>();
	}
	
	// no lo necesito
	// me sirve para testear
	//public void agregarPedido(Pedido p) {
	//	this.pedidos.add(p);
	//}
	
	// Crear un pedido para un cliente
	public boolean crearPedido(FormaDePago pago, FormaDeEnvio envio, Producto producto, int cant) {
		if (producto.estaDisponible(cant)) {
			this.pedidos.add(new Pedido(pago, envio, producto,cant));
			//System.out.print("Se ha realizado el pedido con éxito");
			return true;
		}
		//System.out.print("No hay stock disponible para realizar el pedido");
		return false;
	}
	
	
	// recomendacion del profe, probar usando la clase Bag que fue creada en el ej anterior
	// Conocer la cantidad de productos pedidos por categoría
	public Map<String, Long> getCategoriasDeProductos(){
		return this.pedidos.stream().collect(Collectors.groupingBy(p -> p.getCategoria(), Collectors.counting()));
	}
	
	
	// no es necesario. la responsabilidad de esto es del Pedido
	// consultar costo del pedido
	//public double consultarCostoPedido(Pedido p) {
		
		// puedo comparar pedido == p ??? o tengo que hacer un metodo en Pedido que compare dos pedidos y me devuelva true/false ???
	//	Pedido aux = this.pedidos.stream().filter(pedido -> pedido == p).findFirst().orElse(null);
	//	if (aux != null) {
	//		return aux.calcularCostoTotal(this.getDireccion());
	//	}
	//	System.out.print("El Pedido no existe");
	//	return 0;
		
	//}
}
