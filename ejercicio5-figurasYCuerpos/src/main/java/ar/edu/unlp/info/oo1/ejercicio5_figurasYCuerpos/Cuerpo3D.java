package ar.edu.unlp.info.oo1.ejercicio5_figurasYCuerpos;

public class Cuerpo3D {
	
	// defino variables
	private double altura;
	private Figura caraBasal;
	
	// constructor
	
	// metodos
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal (Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return this.altura * this.caraBasal.getArea();
	}
	
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura;
	}
}
