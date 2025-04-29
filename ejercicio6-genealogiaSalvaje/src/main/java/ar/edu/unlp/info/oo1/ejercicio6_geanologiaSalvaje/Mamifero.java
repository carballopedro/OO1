package ar.edu.unlp.info.oo1.ejercicio6_geanologiaSalvaje;

import java.time.LocalDate;


public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	
	// Getters
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}

	public Mamifero() {
		//this.identificador = "";
	}

	public String getIdentificador() {
		return this.identificador;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public  Mamifero getMadre() {
		return this.madre;
	}
	
	public Mamifero getAbueloMaterno() {
		
		// return (<condicion>)? q devuelve si es true : q devuelve si es false;
		return (this.madre == null)? null : this.madre.getPadre();
		
		// otra opcion:
		
		//if (this.madre == null) {
		//	return null;
		//}
		//else
		//return this.madre.getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.madre == null)? null : this.madre.getMadre();
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.padre == null)? null : this.padre.getPadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.padre == null)? null : this.padre.getMadre();
	}
	
	
	// Setters
	
	public void setIdentificador (String identificador) {
		this.identificador = identificador;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void setFechaNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	// Otros
	
	public boolean tieneComoAncestroA (Mamifero ancestro) {
		boolean linajeMaterno, linajePaterno;
		linajeMaterno = (this.madre == null)? false : (this.madre.equals(ancestro) || this.madre.tieneComoAncestroA(ancestro));
		linajePaterno = (this.padre == null)? false : (this.padre.equals(ancestro) || this.padre.tieneComoAncestroA(ancestro));
		return (linajeMaterno || linajePaterno);
	}
}
