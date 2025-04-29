package ar.edu.unlp.info.oo1.ejercicio22_estadisticasClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {

	// Declaraciones
	Email email1;
	Email email2;
	List<Archivo> archivos1;
	List<Archivo> archivos2;
	Archivo archivo1;
	Archivo archivo2;
	Archivo archivo3;
	
	Carpeta carpeta1;
	Carpeta carpeta2;
	
	Map<String, Long> categorias;
	
	Email emailMediano;
	Email emailGrande;
	Email emailGrande2;
	Email emailGrande3;

	
	List<Archivo> archivosMediano;
	List<Archivo> archivosGrande;
	
	Carpeta carpetaCategorias;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		
		this.archivo1 = new Archivo("Archivo1");
		this.archivo2 = new Archivo("Archivo2");
		this.archivo3 = new Archivo("Archivo3");
		
		
		this.archivos1 = new ArrayList<Archivo>();
		this.archivos1.add(archivo1);
		this.archivos1.add(archivo2);
		
		this.archivos2 = new ArrayList<Archivo>();
		this.archivos2.add(archivo3);
		
		
		this.email1 = new Email("Titulo", "Cuerpo", this.archivos1);
		this.email2 = new Email("Titulo", "Cuerpo", this.archivos2);
		
		this.carpeta1 = new Carpeta("Carpeta");
		this.carpeta1.addEmail(email1);
		this.carpeta1.addEmail(email2);
		
		this.carpeta2 = new Carpeta("Carpeta");		

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
		this.emailGrande2 = new Email("","", this.archivosGrande);
		this.emailGrande3 = new Email("","", this.archivosGrande);
		
		this.carpetaCategorias = new Carpeta("Carpeta");
		this.carpetaCategorias.addEmail(email1);
		this.carpetaCategorias.addEmail(email2);
		this.carpetaCategorias.addEmail(emailMediano);
		this.carpetaCategorias.addEmail(emailGrande);
		this.carpetaCategorias.addEmail(emailGrande2);
		this.carpetaCategorias.addEmail(emailGrande3);

		categorias = new HashMap<String, Long>();
		categorias.put("Pequeño", (long) 2);
		categorias.put("Mediano", (long) 1);
		categorias.put("Grande", (long) 3);

	}
	
	@Test
	void testMover() {
		// carpeta2 aun no tiene mails
		assertEquals(null, this.carpeta2.buscarEmail("Cuerpo"));
		
		this.carpeta1.mover(email1, this.carpeta2);
		
		// carpeta2 ahora tiene mails
		assertEquals(this.email1, this.carpeta2.buscarEmail("Cuerpo"));
	}
	
	@Test
	void testBuscarEmail() {
		// contiene el email
		assertEquals(this.email1, this.carpeta1.buscarEmail("Cuerpo"));
		
		// np contiene el email
		assertEquals(null, this.carpeta1.buscarEmail("Otro"));
	}
	
	@Test
	void testEspacioCarpeta() {
		// 48 es el tamaño de la carpeta = tamaño de sus emails (email1=28, email2=20)
		assertEquals(48, this.carpeta1.espacioCarpeta());
	}
	
	@Test
	void cantidadDeEmailsEnCarpeta() {
		// 2 es la cantidad de mails que tiene la carpeta 1
		assertEquals(2, this.carpeta1.cantidadDeEmailsEnCarpeta());
		
		// 0 es la cantidad de mails que tiene la carpeta 2
		assertEquals(0, this.carpeta2.cantidadDeEmailsEnCarpeta());
	}
	
	@Test
	void cantidadDeEmailsPorCategoria() {
		// categorias tiene 2 emails pequeños, 1 mediano y 3 grandes
		// carpetaCategorias tiene 2 emails pequeños, 1 mediano y 3 grandes
		assertEquals(this.categorias ,this.carpetaCategorias.cantidadDeEmailsPorCategoria());
	}
}
