package ar.edu.unlp.info.oo1.ejercicio0_cuentaConGanchos;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer(double monto);
	

	// TAREA B
	// a) ¿Por qué cree que este ejercicio se llama "Cuenta con ganchos"?
	// 
	// b) En las implementaciones de los métodos extraer() y transferirACuenta()  que se ven en el diagrama, 
	// ¿quién es this? ¿Puede decir de qué clase es this?
	//
	// c) ¿Por qué decidimos que los métodos puedeExtraer() y extraerSinControlar tengan visibilidad "protegido"?
	//
	// d) ¿Se puede transferir de una caja de ahorro a una cuenta corriente y viceversa? ¿por qué? ¡Pruébelo!
	//
	// e) ¿Cómo se declara en Java un método abstracto? ¿Es obligatorio implementarlo?
	// ¿Qué dice el compilador de Java si una subclase no implementa un método abstracto que hereda?
	//
	
}
