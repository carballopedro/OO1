package ar.edu.unlp.info.oo1.ejercicio5_figurasYCuerpos;

public class Cuadrado implements Figura {

	// Defino variables de instancia
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return this.lado * 4;
	}
	
	public double getArea() {
		return Math.pow(this.lado, 2);
	}
}
