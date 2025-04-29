package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public abstract class Servicio {

	private Mascota mascota;
	private LocalDate fecha;
	
	public Servicio(Mascota mascota, LocalDate fecha) {
		this.mascota = mascota;
		this.fecha = fecha;
	}
	
	// 10% descuento si mascota tiene mas de 4 servicios
	public double descuento() {
		return (this.mascota.masDe4Servicios())? 0.9 : 1;
	}
	
	public double adicionalDomingo() {
		return (this.fecha.getDayOfWeek().toString().equals("Sunday"))? 200 : 0;

	}
	
	public boolean mismaFecha(LocalDate fecha) {
		return this.fecha.equals(fecha);
	}
	
	public abstract double calcularCostoServicio();
}

// clases abstractas no tienen tests