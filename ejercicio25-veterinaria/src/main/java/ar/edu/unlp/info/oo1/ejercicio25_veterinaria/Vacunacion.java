package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public class Vacunacion extends ServicioMedico {

	private String nombreVacuna;
	private double costo;
	
	public Vacunacion(Mascota mascota, Medico medico, LocalDate fecha, String nombreVacuna, double costo) {
		super(mascota, medico, fecha);
		this.nombreVacuna = nombreVacuna;
		this.costo = costo;
	}
	
	public double calcularCostoServicio() {
		return this.calcularCosto(500) + this.costo;
	}
}
