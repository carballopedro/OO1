package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public class Consulta extends ServicioMedico {

	public Consulta(Mascota mascota, Medico medico, LocalDate fecha) {
		super(mascota, medico, fecha);
	}
	

	public double calcularCostoServicio() {
		return this.calcularCosto(300) + (this.antiguedadMedico() * 100);
	}
}
