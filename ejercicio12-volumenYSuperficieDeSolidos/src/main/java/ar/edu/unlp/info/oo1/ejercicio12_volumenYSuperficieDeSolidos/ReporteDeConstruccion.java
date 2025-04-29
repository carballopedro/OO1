package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion {

	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza (Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public List<Pieza> getPiezas(){
		return this.piezas;
	}
	
	
	// "Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro')
	// Retorna la suma de los volúmenes de todas las piezas hechas en ese material"
	public double volumenDeMaterial (String material) {
		return this.piezas.stream()
				.filter(pieza -> pieza.getMaterial() == material)
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	// "Recibe como parámetro un color (un string, por ejemplo 'Rojo')"
	// Retorna la suma de las superficies externas de todas las piezas pintadas con ese color".
	public double superficieDeColor (String color) {
		return this.piezas.stream()
				.filter(pieza -> pieza.getColor() == color)
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
	}
}


// Discuta con el ayudante
// Es probable que note una similitud entre este ejercicio y el de "Figuras y cuerpos" que realizó anteriormente,
// ya que en ambos se pueden construir cilindros y prismas rectangulares. Sin embargo las implementaciones varían.
// Enumere las diferencias y similitudes entre ambos ejercicios y luego consulte con el ayudante.


// En este ejercicio se tiene una clase abstracta Pieza, a diferencia de la interfaz Figura en el ejerciio FigurasYCuerpos,
// ya que las piezas tienen variables (material, color) y comportamiento (getMaterial, getColor, Pieza(material, color) en comun

// En este ejercicio las piezas pueden calcular su volumen y su superficie, y en el ejercicio FiguraYCuerpos las figuras pueden
// calcular su area y perimetro.
