package ar.edu.unlp.info.oo1.ejercicio22_estadisticasClienteDeCorreo;

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
	
	// devuelve categoria de email
	//Pequeño: el email tiene un tamaño entre 0 y 300
	//Mediano: el email tiene un tamaño entre 301 y 500
	// Grande: el email tiene un tamaño mayor a 501
	public String getCategoria() {
		String aux;
		int tamaño = this.calcularTamaño();
		aux = (tamaño > 501)? "Grande" : (tamaño > 301)? "Mediano" : "Pequeño";
		return aux;
	}
}
