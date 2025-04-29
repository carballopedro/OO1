package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.List;
import java.util.ArrayList;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email (String titulo, String cuerpo, List<Archivo> adjuntos) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>(adjuntos);
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}
	
	
	// El tamaño de un email es la suma del largo del título, el largo del cuerpo, y del tamaño de sus adjuntos.
	public int calcularTamaño() {
		int tamañoAdjuntos = this.adjuntos.stream().mapToInt(Archivo::tamaño).sum();
		return this.titulo.length() + this.cuerpo.length() + tamañoAdjuntos;
	}
	
	// devuelve true si el mail contiene la variable texto en su cuerpo o titulo. false en caso contrario
	public boolean contiene(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto));
	}
}
