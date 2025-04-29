package ar.edu.unlp.info.oo1.ejercicio15_distribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	
	private LocalDate fecha;
	private double bonificacion;
	private double montoFinal;
	
	// la factura necesita ademas al usuario
	// se lo mandaria como parametro y lo guarda en una variable de instancia
	
	public Factura(double bonificacion, double montoFinal) {
		this.fecha = LocalDate.now();
		this.bonificacion = bonificacion;
		this.montoFinal = montoFinal;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getBonificacion() {
		return this.bonificacion;
	}
	
	public double getMontoFinal() {
		return this.montoFinal;
	}
	
}

// no necesito tests de esta clase