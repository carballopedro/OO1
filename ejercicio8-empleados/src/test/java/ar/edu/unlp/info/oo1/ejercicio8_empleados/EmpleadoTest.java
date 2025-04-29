package ar.edu.unlp.info.oo1.ejercicio8_empleados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmpleadoTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
    @Test
    public void test() {

    	Gerente alan = new Gerente("Alan Turing");
    	double aportesDeAlan = alan.aportes();
    	
    	System.out.println("APORTES DE ALAN = " + aportesDeAlan); // imprime 2850
    	
    	// Aportes de Alan (Gerente)
    	// 1) Método +aportes() de la clase Gerente
    	// 2) Método +montoBasico() de la clase Gerente
    	// Resultado 57000 * 0.05d = 2850
    	
    	
    	Gerente alan2 = new Gerente("Alan Turing");
    	double sueldoBasicoDeAlan = alan2.sueldoBasico(); // 56500
    	
		System.out.println("SUELDO BASICO DE ALAN = " + sueldoBasicoDeAlan);
		// Sueldo basico de Alan (Gerente)
		// 1) Búsqueda de método en clase Gerente (no lo encuentra)
		// 2) Método +sueldoBasico() de la clase EmpleadoJerarquico
		// 3) Método +sueldoBasico() de la clase Empleado
		// 4) Métodos +montoBasico() y aportes() de la clase Gerente -> 57000 + 2850 = 59850
		// 5) Búsqueda de método +bonoPorCategoria en la clase Gerente (no lo encuentra)
		// 6) Método +bonoPorCategoria() de la clase Empleado Jerárquico -> devuelve 8000
		// 7) 59850 + 8000 = 67850
		// 8) Se devuelve el valor 67850
		
    }
}
