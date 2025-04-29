package ar.edu.unlp.info.oo1.ejercicio24_poolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario {

	// me sirve para saber si realizó un viaje en los ult 30 dias
	private LocalDate fechaUltViaje;
	
	// deberia el pasajero tener una lista de sus viajes?
	// decidi guardar solamente la fecha del ultimo viaje xq con eso me alcanza
	// y el sistema no me pide q el pasajero guarde una lista de todos sus viajes
	
	public Pasajero (String nombre, double saldo) {
		super(nombre, saldo);
		this.fechaUltViaje = null;
	}
	
	public boolean saldoEnRojo() {
		return this.getSaldo() < 0;
	}
	
	// En el caso de un pasajero, se cobra una comisión del 10% solo si no realizó ningún viaje los últimos 30 días.
	public void cargarSaldo(double monto) {
		if (ChronoUnit.DAYS.between(fechaUltViaje, LocalDate.now()) <= 30) {
			this.agregarSaldo(monto);
		}
		else
			this.agregarSaldo(monto*0.9);
	}
	
	// Del monto correspondiente a un pasajero, se bonifica $500 si el usuario hizo un viaje en el pasado. 
	public void cobrarViaje(double monto, LocalDate fecha) {
		// si nunca realizo un viaje no tiene bonificacion
		if (this.fechaUltViaje == null) {
			this.restarSaldo(monto);
		}
		else {
			this.restarSaldo(monto - 500);
		}
		// actualizo fecha de ultimo viaje
		this.fechaUltViaje = fecha;
	}
	
	// CORRECCION DEL PROFE
	// no tengo seguridad de que el viaje se procesa en el momento que se realiza, x lo tanto la fecha de viaje
	// que me estoy guardando no es necesariamente la ultima.
	// voy a tener que guardarme una lista de viajes realizados
	
	// SIN EMBARGO
	// guardarme una lista de viajes del pasajero tampoco nada del enunciado me asegura que esos viajes se hayan realizado
	// ya que al cobrar un viaje tampoco nada me asegura que se haya realizado ese viaje
	
	// RELEYENDO EL ENUNCIADO
	// el enunciado dice "Al procesar un viaje..... El costo total del viaje se reparte en partes 
	// iguales entre todos los integrantes que PARTICIPARON..." por lo tanto, se asume que se procesa un viaje
	// una vez realizado. por lo tanto mi solucion de guardar solo la fecha del ultimo viaje esta bien

}
