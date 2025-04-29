package ar.edu.unlp.info.oo1.ejercicio22_estadisticasClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {

	// Declaraciones
	Email email;
	List<Archivo> archivos;
	Archivo archivo1;
	Archivo archivo2;
	Archivo archivo3;
	
	Email emailMediano;
	Email emailGrande;
	
	List<Archivo> archivosMediano;
	List<Archivo> archivosGrande;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		
		this.archivo1 = new Archivo("Archivo1");
		this.archivo2 = new Archivo("Archivo2");
		this.archivo3 = new Archivo("Archivo3");
		
		this.archivos = new ArrayList<Archivo>();
		this.archivos.add(archivo1);
		this.archivos.add(archivo2);
		this.archivos.add(archivo3);
		
		this.email = new Email("Titulo", "Cuerpo", this.archivos);

		
		this.archivosMediano = new ArrayList<Archivo>();
		for (int i=0; i<302; i++) {
			this.archivosMediano.add(new Archivo("1"));
		}
		this.emailMediano = new Email("","", this.archivosMediano);
		
		this.archivosGrande = new ArrayList<Archivo>();
		for (int i=0; i<502; i++) {
			this.archivosGrande.add(new Archivo("1"));
		}
		this.emailGrande = new Email("","", this.archivosGrande);
		
		
	}
	
	// test del método calcular tamaño
	@Test
	void testCalcularTamaño() {
		// 36 sería la suma del tamaño de los archivos + el nombre y el título del email
		assertEquals(36, this.email.calcularTamaño());
	}
	
	// test del método contiene
	@Test
	void testContiene() {
		// contiene
		assertTrue(this.email.contiene("Cuerpo"));
		
		// no contiene
		assertFalse(this.email.contiene("Otro"));
	}
	
	@Test
	void testGetCategoria() {
		assertEquals("Pequeño", this.email.getCategoria());
		assertEquals("Mediano", this.emailMediano.getCategoria());
		assertEquals("Grande", this.emailGrande.getCategoria());
	}
}
