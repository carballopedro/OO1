package ar.edu.unlp.info.oo1.ejercicio0_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	protected CuentaCorriente cuenta;
	protected CuentaCorriente cuenta2;

	
	@BeforeEach
	void setUp() {
		cuenta = new CuentaCorriente();
		cuenta2 = new CuentaCorriente();

	}
	
	// al testear extraer() tambien se estan testeando puedeExtrear() y extraerSinControlar()
	@Test
	void extraer() {
		
		// no tiene saldo suficiente para extraer
		assertEquals(false, cuenta.extraer(100));
	
		cuenta.depositar(100);
		cuenta.setDescubierto(10);
		
		// tiene saldo suficiente para extraer (saldo + descubierto = 110)
		// se quiere extraer 110 = saldo + descubierto
		assertEquals(true, cuenta.extraer(110));
	}
	
	// se testea el metodo transferirACuenta()
	@Test
	void transferirACuenta() {
		
		// no hay saldo suficientes para transferencia
		assertEquals(false, cuenta.transferirACuenta(100, cuenta2));
		
		// saldo suficiente para transferencia
		cuenta.depositar(100);
		cuenta.setDescubierto(10);
		assertEquals(100, cuenta.getSaldo());

		// monto a transferencia debe ser menor o igual al saldo + descubierto = 110
		assertEquals(true, cuenta.transferirACuenta(110, cuenta2));
		
		//corrobora saldo transferido
		assertEquals(110, cuenta2.getSaldo());

	}

}
