package ar.edu.unlp.info.oo1.ejercicio17_alquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	// Declaraciones
	Usuario usuario;
	Usuario usuario2;
	Propiedad p1;
	Propiedad p2;
	
	Reserva r1;
	Reserva r2;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		usuario = new Usuario("Nombre", "Direccion", 41403845);

		usuario2 = new Usuario("Nombre", "Direccion", 41403845);
		p1 = new Propiedad("Direccion", "Nombre", 10);
		p2 = new Propiedad("Direccion", "Nombre", 1);
		
		LocalDate from1 = LocalDate.of(2023, 01, 01);
		LocalDate to1 = LocalDate.of(2023, 01, 31);
		r1 = new Reserva(from1, to1, 10);
		
		LocalDate from2 = LocalDate.of(2023, 01, 01);
		LocalDate to2 = LocalDate.of(2023, 01, 31);
		r2 = new Reserva(from1, to1, 10);
		
		p1.addReserva(r1);
		p2.addReserva(r2);
		
		usuario2.addPropiedad(p1);
		usuario2.addPropiedad(p2);
		
	}
	
	// Tests
	@Test
	void testCalcularIngresos() {
		
		// usuario sin propiedades
		LocalDate from3 = LocalDate.of(2023, 01, 01);
		LocalDate to3 = LocalDate.of(2023, 01, 31);
		assertEquals(0, this.usuario.calcularIngresos(from3, to3));
		
		// usuario con propiedades
		LocalDate from4 = LocalDate.of(2023, 01, 01);
		LocalDate to4 = LocalDate.of(2023, 01, 31);
		// 600 en reservas * 0.75
		assertEquals(450, this.usuario2.calcularIngresos(from3, to3));
	}
	
}
