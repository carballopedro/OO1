package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

public class Cilindro extends Pieza {
	
	private int radio;
	private int altura;
	
	public Cilindro(int radio, int altura, String material, String color) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	// Volumen de un cilindro: π * radio 2 * h.
	public double getVolumen() {
		// this.radio o getRadio() ???
		return Math.PI * Math.pow(this.radio, 2) * this.altura;
	}
	
	// Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio 2 
	public double getSuperficie () {
		return (2 * Math.PI * this.radio * this.altura) + (2 * Math.PI * Math.pow(this.radio, 2));
	}
	

}
