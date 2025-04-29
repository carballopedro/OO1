package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

public class PrismaRectangular extends Pieza {
	
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular(int ladoMayor, int ladoMenor, int altura, String material, String color) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}
	
	public int getLadoMenor() {
		return this.ladoMenor;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	// Volumen del prisma: ladoMayor * ladoMenor * altura
	public double getVolumen () {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	// Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
	public double getSuperficie () {
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
	
}
