package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

public class Esfera extends Pieza {
	
	private int radio;
	
	public Esfera(int radio, String material, String color) {
		super(material, color);
		this.radio = radio;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	// Volumen de una esfera: ⁴⁄₃ * π * radio ³.
	public double getVolumen () {
		return ((4/3) * Math.PI * Math.pow(this.radio, 3));
	}
	
	// Superficie de una esfera: 4 * π * radio 2
	public double getSuperficie () {
		return (4 * Math.PI * Math.pow(this.radio, 2));
	}
	
}
