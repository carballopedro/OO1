package ar.edu.unlp.info.oo1.ejercicio24_poolCar;

import java.time.LocalDate;

public class Conductor extends Usuario {
	
	private Vehiculo vehiculo;
	
	public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
		super(nombre, saldo);
		this.vehiculo = vehiculo;
	}
	
	// Para el caso de los conductores, la comisión es siempre del 1% si el auto tiene menos de 5 años. Si no, es del 10%.
	public void cargarSaldo(double monto) {
		if (this.vehiculo.menosDe5Años()) {
			this.agregarSaldo(monto*0.99);
		}
			this.agregarSaldo(monto*0.90);
	}
	
	//  Del monto correspondiente al conductor, se le bonifica el 0.1% del valor del vehículo utilizado para el viaje.
	public void cobrarViaje(double monto, LocalDate fecha) {
		double montoActualizado = monto - (this.vehiculo.getValorMercado() * 0.1);
		this.restarSaldo(montoActualizado);
	}

}