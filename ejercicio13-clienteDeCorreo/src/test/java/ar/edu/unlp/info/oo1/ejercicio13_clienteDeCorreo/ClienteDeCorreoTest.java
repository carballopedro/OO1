package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {

	// Declaraciones
	protected ClienteDeCorreo cliente;

	Email email1;
	Email email2;
	List<Archivo> archivos1;
	List<Archivo> archivos2;
	Archivo archivo1;
	Archivo archivo2;
	Archivo archivo3;
	
	Carpeta carpeta1;
	Carpeta carpeta2;
	
	
	// Instanciaciones
	@BeforeEach
	void setUp(){
		
		cliente = new ClienteDeCorreo();
		
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
		
		this.cliente.addCarpeta(carpeta1);
		this.cliente.addCarpeta(carpeta2);
		
	}
	
	// no es necesario testear los otros métodos
	
	// Tests
	@Test
	void testBuscar() {
		// devuelve email1 xq es el primero que encuentra con la palabra "Cuerpo"
		assertEquals(this.email1, this.cliente.buscar("Cuerpo"));
	}
	
	@Test
	void testEspacioOcupadoß() {
		// tamaño de carpetas = 48 (carpeta1=48, carpeta2=0)
		assertEquals(48, this.cliente.espacioOcupado());
	}

}
