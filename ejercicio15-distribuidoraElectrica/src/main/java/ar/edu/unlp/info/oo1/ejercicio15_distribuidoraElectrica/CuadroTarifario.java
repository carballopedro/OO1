package ar.edu.unlp.info.oo1.ejercicio15_distribuidoraElectrica;

public class CuadroTarifario {

	private double precioKwh;
	
	public CuadroTarifario(double precioKwh) {
		this.precioKwh = precioKwh;
	}
	
	public double getPrecioKwh() {
		return this.precioKwh;
	}
	
	public void setPrecio(double newPrecioKwh) {
		this.precioKwh = newPrecioKwh;
	}
	
}

// no necesito test de esta clase