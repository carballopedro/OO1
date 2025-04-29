package ar.edu.unlp.info.oo1.ejercicio25_veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {

	private String nombre;
	private LocalDate fechaNac;
	private String especie;
	private List<Servicio> servicios;
	
	public Mascota(String nombre, LocalDate fechaNac, String especie) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.especie = especie;
		this.servicios = new ArrayList<Servicio>();
	}
	
	public boolean masDe4Servicios() {
		return this.servicios.size() >= 5 ;
	}
	
	public Consulta altaConsulta(Medico medico) {
		Consulta c = new Consulta(this, medico, LocalDate.now());
		this.servicios.add(c);
		return c;
	}
	
	public Vacunacion altaVacunacion(Medico medico, String nombre, double costo) {
		Vacunacion v = new Vacunacion(this, medico, LocalDate.now(), nombre, costo);
		this.servicios.add(v);
		return v;
	}
	
	public Guarderia altaGuarderia(int cantDias) {
		Guarderia g = new Guarderia(this, LocalDate.now(), cantDias);
		this.servicios.add(g);
		return g;
	}
	
	public double recaudacion(LocalDate fecha) {
		return this.servicios.stream().filter(s -> s.mismaFecha(fecha)).mapToDouble(s -> s.calcularCostoServicio()).sum();
	}
	
}
