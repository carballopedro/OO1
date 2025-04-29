package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class EnvioExpress implements FormaDeEnvio {
	
	private CalculadoraDeDistancia calculadora;

	public EnvioExpress (CalculadoraDeDistancia calculadora) {
		this.calculadora = calculadora;
	}
	
	// $0.5 * distancia entre direcciones
	public double getCostoDeEnvio(String origen, String destino) {
		return this.calculadora.distanciaEntre(origen,destino) * 0.5;
	}
	
}
