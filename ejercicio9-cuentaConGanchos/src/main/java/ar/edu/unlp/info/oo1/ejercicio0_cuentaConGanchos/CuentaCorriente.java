package ar.edu.unlp.info.oo1.ejercicio0_cuentaConGanchos;

public class CuentaCorriente extends Cuenta{
	
	private double descubierto;
	
	public CuentaCorriente() {
		super(); // constructor de Cuenta
		this.descubierto = 0;
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		return monto <= (this.descubierto + this.getSaldo());
	}
	
}
