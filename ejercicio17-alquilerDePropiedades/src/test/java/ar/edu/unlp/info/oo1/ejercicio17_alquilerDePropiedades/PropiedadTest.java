package ar.edu.unlp.info.oo1.ejercicio17_alquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {

	// Declaraciones
	Propiedad p2;
	
	Reserva r;
	Reserva r2;
	Reserva r3;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		p2 = new Propiedad("Direccion", "Nombre", 10);
		
		LocalDate from1 = LocalDate.of(2023, 01, 01);
		LocalDate to1 = LocalDate.of(2023, 01, 31);
		r = new Reserva(from1, to1, 10);

		p2.addReserva(r);
		
		LocalDate from7 = LocalDate.of(2025, 01, 01);
		LocalDate to7 = LocalDate.of(2025, 01, 31);
		r2 = new Reserva(from7, to7, 10);
		
		LocalDate from8 = LocalDate.of(2024, 01, 01);
		LocalDate to8 = LocalDate.of(2024, 11, 30);
		r3 = new Reserva(from8, to8, 10);
		

	}
	
	// Tests
	@Test
	void testEstaDisponible() {
		// p2 esta disponible en esa fecha
		LocalDate from2 = LocalDate.of(2024, 01, 01);
		LocalDate to2 = LocalDate.of(2024, 01, 31);
		assertTrue(this.p2.estaDisponible(from2, to2));
		
		// p2 no esta disponible en esa fecha
		LocalDate from3 = LocalDate.of(2023, 01, 01);
		LocalDate to3 = LocalDate.of(2023, 01, 15);
		assertFalse(this.p2.estaDisponible(from3, to3));
	}
	
	@Test
	void testCalcularIngresosPropiedad() {
		// p2 no tiene ingresos en esa fecha
		LocalDate from5 = LocalDate.of(2024, 01, 01);
		LocalDate to5 = LocalDate.of(2024, 01, 31);
		assertEquals(0, p2.calcularIngresosPropiedad(from5, to5));
		
		// p2 tiene ingresos en esa fecha (300 de ingreso = 30 noches * 10 por noche)
		LocalDate from6 = LocalDate.of(2023, 01, 01);
		LocalDate to6 = LocalDate.of(2023, 01, 31);
		assertEquals(300, p2.calcularIngresosPropiedad(from6, to6));		
	}
	
	@Test
	void testCrearReserva() {
		// no se crea reserva xq propiedad no esta disponible
		LocalDate from9 = LocalDate.of(2023, 01, 01);
		LocalDate to9 = LocalDate.of(2023, 01, 31);
		assertFalse(this.p2.crearReserva(from9, to9));
		
		// se crea reserva xq propiedad esta disponible
		LocalDate from10 = LocalDate.of(2025, 01, 01);
		LocalDate to10 = LocalDate.of(2025, 01, 31);
		assertTrue(this.p2.crearReserva(from10, to10));

	}
	
	@Test
	void testCancelarReserva() {
		
		p2.addReserva(r2);
		p2.addReserva(r3);
		// reserva se cancela correctamente xq no esta en curso
		assertTrue(this.p2.cancelarReserva(r2));
		
		// reserva no se cancela correctamente xq esta en curso
		assertFalse(this.p2.cancelarReserva(r3));
	}
	

}
