package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.List;
import java.util.ArrayList;

public class Carpeta {
	
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Email> getEmails() {
		return this.emails;
	}
	
	public void addEmail(Email email) {
		this.emails.add(email);
	}
	
	public void deleteEmail(Email email) {
		this.emails.remove(email);
	}
	
	// mueve el email desde una carpeta de origen a una carpeta destino
	// (asuma que el email está en la carpeta origen cuando se recibe este mensaje). 
	public void mover(Email email, Carpeta destino) {
		
		// agrego mail a carpeta destino y despues borro de carpeta origen o al reves?
		destino.addEmail(email);
		this.deleteEmail(email);
	}
	
	// busca el primer mail que contenga la variable texto en su titulo o cuerpo. si no hay ninguno devuelve null
	public Email buscarEmail(String texto) {
		return this.emails.stream()
				.filter(email -> email.contiene(texto) == true)
				.findFirst()
				.orElse(null);
	}
	
	// calcula tamaño de carpeta (tamaño carpeta = tamaño de todos los emails que contiene)
	public int espacioCarpeta() {
		return this.emails.stream().mapToInt(Email::calcularTamaño).sum();
	}
}
