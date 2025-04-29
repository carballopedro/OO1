package ar.edu.unlp.info.oo1.ejercicio0_cuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	// pueno no definir este constructor
	public CajaDeAhorro() {
		super(); // Constructor de cuenta
	}
	
	// la caja de ahorro debe tener suficiente saldo para la extracción (saldo + interes de saldo)
	@Override
	public boolean puedeExtraer(double monto) {
		return (this.getSaldo() >= monto + (monto * 0.02));
	}
	
	// costo adicional del 2% del monto al depositar
	// super llama al método depositar de Cuenta
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}
	
	// redefino metodo extraerSinControlar 
	// super llama al metodo extraerSinControlar de Cuenta pero con el valor de monto + el interes del 2%
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * 0.02));
	}
	
}
