package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{
	
	private List<Producto> productos;
	
	public Vendedor (String nombre, String direccion) {
		super(nombre, direccion);
		productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}

}

// esta clase no necesita test