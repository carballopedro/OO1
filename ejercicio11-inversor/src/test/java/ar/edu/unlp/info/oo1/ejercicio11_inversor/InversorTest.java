package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	// Declaraciones
	protected Inversor inversor; 
	protected PlazoFijo plazoFijo; 
	protected InversionEnAcciones inversionEnAcciones;
	
	// Instancias
	// Declaraciones de variables
    @BeforeEach
    void setUp() {
    	inversor = new Inversor("Nombre");
    	plazoFijo = new PlazoFijo(LocalDate.now(), 3000, 0.01);
    	inversionEnAcciones = new InversionEnAcciones("Nombre", 100, 300);
    }
    
    // Tests: asserts y otros
    @Test
    void valorActualSinElementos() {
    	// compruebo que si la lista de inversiones esta vacia me devuelva 0
    	assertEquals(0, inversor.valorActual());
    }
    
    @Test
    void valorActualConElementos() {    	
    	// compruebo el valor actual
    	inversor.agregarInversion(inversionEnAcciones);
    	assertEquals(30000, inversor.valorActual());
    	
    	inversor.agregarInversion(plazoFijo);
    	assertEquals(33000, inversor.valorActual());
    	
    }
}
