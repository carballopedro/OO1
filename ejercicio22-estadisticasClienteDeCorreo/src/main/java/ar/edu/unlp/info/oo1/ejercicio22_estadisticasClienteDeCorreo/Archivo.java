package ar.edu.unlp.info.oo1.ejercicio22_estadisticasClienteDeCorreo;

public class Archivo {
	
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	// Se asume que el tamaño de un archivo es el largo de su nombre.
	public int tamaño() {
		return this.nombre.length();
	}
	
}
