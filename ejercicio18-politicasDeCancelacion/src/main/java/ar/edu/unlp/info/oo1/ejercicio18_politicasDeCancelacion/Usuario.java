package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// NECESITO LOS SETTERS EN LAS CLASES???

public class Usuario {

	private String nombre;
	private String direccion;
	private int dni;
	
	// propiedades propias
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
		}
	
	// NO SON NECESARIOS
	// getters
	//public String getNombre() {
	//	return this.nombre;
	//}
	
	//public String getDireccion() {
	//	return this.direccion;
	//}
	
	//public int getDni() {
	//	return this.dni;
	//}
	
	// NO NECESITO SETTERS YA QUE TENGO CONSTRUCTOR
	// SALVO QUE EL EJERCICIO ME LO PIDA ESPECIFICAMENTE PARA UN FUTURO CAMBIO DE VALOR DE UNA INSTANCIA
	// setters
	//public void setNombre(String nombre) {
	//	this.nombre = nombre;
	//}
	
	//public void setDireccion(String direccion) {
	//	this.direccion = direccion;
	//}
	
	//public void setDni(int dni) {
	//	this.dni = dni;
	//}
	
	
	// addPropiedad
	public void addPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	// calcula la retribución a un propietario
	// la cual es el 75% de la suma de precio totales de las reservas incluidas en un período específico de tiempo.
	public double calcularIngresos(LocalDate fechaInicial, LocalDate fechaFinal) {
		return (this.propiedades.stream()
				.mapToDouble(propiedad -> propiedad.calcularIngresosPropiedad(fechaInicial, fechaFinal))
				.sum()) * 0.75;
	}
}
