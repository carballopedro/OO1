package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public class Guarderia extends Servicio {
	
	private int cantDias;
	
	public Guarderia (Mascota mascota, LocalDate fecha, int cantDias) {
		super(mascota, fecha);
		this.cantDias = cantDias;
	}
	
	public double calcularCostoServicio() {
		return (this.cantDias * 500) * this.descuento();
	}
}
