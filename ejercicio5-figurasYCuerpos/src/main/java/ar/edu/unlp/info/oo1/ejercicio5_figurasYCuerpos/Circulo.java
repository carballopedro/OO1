package ar.edu.unlp.info.oo1.ejercicio5_figurasYCuerpos;

public class Circulo implements Figura {

	// Defino variables de instancia
	
	private double radio;
	
	// si tuviese una variable diametro, cada vez que hago un setRadio o setDiametro tengo q guardar valores a ambas variables
	// para que haya consistencia de datos
	// ejemplo: 	public void setRadio(double radio) {
	//              this.radio = radio;
	//				this.diametro = radio * 2;
	//				}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public void setDiametro(double diametro) {
		this.radio = diametro / 2;
	}
	
	public double getPerimetro() {
		// Math.PI -> me devuelve el valor de pi
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		// Math.PI -> me devuelve el valor de pi
		// Math.pow(this.radio, 2) -> eleva this.radio al cuadrado
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	
}
