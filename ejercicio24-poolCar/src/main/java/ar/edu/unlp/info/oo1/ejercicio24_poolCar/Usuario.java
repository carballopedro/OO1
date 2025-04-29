package ar.edu.unlp.info.oo1.ejercicio24_poolCar;

import java.time.LocalDate;

public abstract class Usuario {
	
	private String nombre;
	private double saldo;
	
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void agregarSaldo(double monto) {
		this.saldo = this.saldo + monto;
	}
	
	public void restarSaldo(double monto) {
		this.saldo = this.saldo - monto;
	}
	
	public abstract void cargarSaldo(double monto);
	
	public abstract void cobrarViaje(double monto, LocalDate fecha);

}

// esta clase no necesita test
