package ar.edu.unlp.info.oo1.ejercicio15_distribuidoraElectrica;

public class Consumo {
	
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(double consumoEnergiaActiva, double consumoEnergiaReactiva ) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	
	public double getConsumoEnergiaReactiva() {
		return this.consumoEnergiaReactiva;
	}
	
	// calcular el factorDePotencia (fpe) a partir de la fórmmula del enunciado
	public double factorDePotencia() {
		return this.consumoEnergiaActiva / Math.sqrt (Math.pow(this.consumoEnergiaActiva, 2) + Math.pow(this.consumoEnergiaReactiva, 2));
	}
	
	// Se calcula su factor de potencia para determinar si hay alguna bonificación aplicable. 
	// Si el factor de potencia estimado (fpe) del último consumo del usuario es mayor a 0.8,
	// el usuario recibe una bonificación del 10%.

	public boolean bonificacion() {
		return this.factorDePotencia() > 0.8;
	}
}
