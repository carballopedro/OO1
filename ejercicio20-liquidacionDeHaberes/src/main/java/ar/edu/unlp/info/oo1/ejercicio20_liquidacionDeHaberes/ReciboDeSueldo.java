package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import java.time.LocalDate;

public class ReciboDeSueldo {
	
	private String nombre;
	private String apellido;
	private String cuil;
	private int antiguedad;
	private double montoTotal;
	private LocalDate fecha;
	
	// OPCION CONSTRUCTOR DONDE LA CLASE EMPELADO GENERA EL RECIBO DE SUELDO
	public ReciboDeSueldo(String nombre, String apellido, String cuil, int antiguedad, double montoTotal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.antiguedad = antiguedad;
		this.montoTotal = montoTotal;
		
		// fecha que se genera el recibo
		this.fecha = LocalDate.now();
	}
	
	// getters para test
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getCuil() {
		return this.cuil;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public double getMontoTotal() {
		return this.montoTotal;
	}
}

// esta clase no necesita test