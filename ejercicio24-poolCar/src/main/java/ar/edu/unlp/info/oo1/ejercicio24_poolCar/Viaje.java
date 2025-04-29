package ar.edu.unlp.info.oo1.ejercicio24_poolCar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {

	private String origen;
	private String destino;
	private double costoTotal;
	private LocalDate fecha;
	
	// a confirmar
	private Vehiculo vehiculo;
	private List<Usuario> pasajeros;
	
	// tendria que tener al conductor como una variable mas o lo agrego a la lista de pasajeros?
	// tendria que pasar al conductor como parametro? en ese caso el vehiculo no necesitaria conocer a su conductor
	
	// si solucion fue asi ya que el enunciado dice explicitamente agregar al dueño del vehiculo como un pasajero
	// x lo tanto lo agrego a la lista de pasajeros
	// x eso tmb paso el vehiculo como parametro en el constructor y de ahi saco a su dueño, ya que, si paso ademas un conductor como
	// parametro nada me asegura que sea el dueño de ese vehiculo
	
	// OTRA OPCION
	// seria pasar al conductor como parametro y de ahi sacar el vehiculo. de esa forma no necesito enviar un vehiculo como
	// parametro y ademas me aseguro q el dueño sea el q lo maneja. x lo q el vehiculo tampoco tendria q concoer a su conductor
	
	public Viaje(String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fecha) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.fecha = fecha;
		this.vehiculo = vehiculo;
		
		this.pasajeros = new ArrayList<Usuario>();
		this.pasajeros.add(this.vehiculo.getConductor());
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	// hay capacidad siemore y cuando la cant de pasajeros sea menor a la capacidad del vehiculo
	public boolean hayCapacidad() {
		return this.pasajeros.size() < this.vehiculo.getCapacidad();
	}
	
	// agrega pasajero a lista de pasajeros
	public boolean registrarPasajero(Pasajero p) {
		// se registra pasajero si hay capacidad, tienen saldo y se registran al menos 2 dias antes
		int days = (int) ChronoUnit.DAYS.between(LocalDate.now(), this.fecha);
		if(this.hayCapacidad() && !p.saldoEnRojo() && days >= 2) {
			this.pasajeros.add(p);
			return true;
		}
			return false;
	}
	
	// procesar viaje
	public void procesarViaje() {
		// El costo total del viaje se reparte en partes iguales entre todos los integrantes que participaron.
		double costoXpasajero = this.costoTotal / this.pasajeros.size();
		this.pasajeros.stream().forEach(u -> u.cobrarViaje(costoXpasajero, this.fecha));
	}

}
