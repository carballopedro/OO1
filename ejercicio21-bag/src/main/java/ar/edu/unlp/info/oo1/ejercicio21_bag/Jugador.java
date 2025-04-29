package ar.edu.unlp.info.oo1.ejercicio21_bag;

public class Jugador {
	
	private String nombre;
	private String apellido;
	
	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
}
