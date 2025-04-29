package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {

	// Declaraciones
	protected ReporteDeConstruccion reporte;
	protected Cilindro cilindro;
	protected Esfera esfera;
	protected PrismaRectangular prisma;
	
	// Instanciaciones
	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		cilindro = new Cilindro(10, 13, "Plastico", "Negro");
		esfera = new Esfera(3, "Madera", "Negro");
		prisma = new PrismaRectangular(8, 5, 10, "Plastico", "Azul");

		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(prisma);
	}
	
	// NO ES NECESARIO
	// tengo que hacer test de agregarPiezas y getPiezas? (agregarPiezas solamente agrega a una lista y getPiezas solamente devuelve una lista)
	
	// Tests
	@Test
	void testVolumenDeMaterial() {
		double volumenPlastico = this.cilindro.getVolumen() + this.prisma.getVolumen();
		assertEquals(volumenPlastico, reporte.volumenDeMaterial("Plastico"));
		
		double volumenMadera = this.esfera.getVolumen();
		assertEquals(volumenMadera, reporte.volumenDeMaterial("Madera"));
	}
	
	@Test
	void testSuperficieDeColor() {
		double superficieNegro = this.cilindro.getSuperficie() + this.esfera.getSuperficie();
		assertEquals(superficieNegro, reporte.superficieDeColor("Negro"));
		
		double superficieAzul = this.prisma.getSuperficie();
		assertEquals(superficieAzul, reporte.superficieDeColor("Azul"));
	}
	
	// Puedo agregarle otro campo a asserEquals para considerar un margen de error
	// EJEMPLO
	// assertEquals(superficieNegro, reporte.superficieDeColor("Negro"), 0,001);
	// margen de error de 0.001

}
