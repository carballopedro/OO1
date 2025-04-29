package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public abstract class Persona {
	
	private String nombre;
	private String direccion;
	
	public Persona (String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	// getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
}

// esta clase no necesita test