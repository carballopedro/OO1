package ar.edu.unlp.info.oo1.ejercicio0_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {

	protected CajaDeAhorro caja;
	protected CajaDeAhorro caja2;
	
	@BeforeEach
	void setUp() {
		caja = new CajaDeAhorro();
		caja2 = new CajaDeAhorro();
	}
	
	// al testear extraer() tambien se estan testeando puedeExtrear() y extraerSinControlar()
	@Test
	void extraer() {
		
		// no tiene saldo suficiente para extraer
		assertEquals(false, caja.extraer(100));

		
		//se depositan 100, saldo queda 98
		caja.depositar(100);
		
		// tiene saldo suficiente para extraer
		// se quieren extraer 96, el saldo debe ser mayor a 96 + interes 2% = 97.92
		// 92.92 < 98 (saldo)
		assertEquals(true, caja.extraer(96));
		
	}
	
	// se testea el metodo transferirACuenta()
	@Test
	void transferirACuenta() {
		
		// no hay saldo suficientes para transferencia
		assertEquals(false, caja.transferirACuenta(100, caja2));
		
		// saldo suficiente para transferencia
		caja.depositar(100);
		assertEquals(98, caja.getSaldo());

		// saldo suficiente para transferencia debe ser mayor a 96 + interes 2% = 97.92
		// 92.92 < 98 (saldo)
		assertEquals(true, caja.transferirACuenta(96, caja2));
		
		// corrobora saldo transferido (96 - 2% interes del deposito)
		assertEquals(94.08, caja2.getSaldo());

		
	}
	
}
