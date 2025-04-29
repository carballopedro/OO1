package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;

public abstract class ServicioMedico extends Servicio {
	
	private Medico medico;
	
	public ServicioMedico(Mascota mascota, Medico medico, LocalDate fecha) {
		super(mascota, fecha);
		this.medico = medico;
	}
	
	public double calcularCosto(double materiales) {
		return this.medico.getHonorarios() + materiales + this.adicionalDomingo();
	}
	
	public int antiguedadMedico() {
		return this.medico.antiguedad();
	}
}

//  clases abstractas no tienen tests