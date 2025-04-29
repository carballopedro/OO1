package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class EnvioRetiroEnComercio implements FormaDeEnvio {

	// Si la forma de envío es  "retirar en el comercio" no hay costo adicional de envío.
	public double getCostoDeEnvio(String origen, String destino) {
		return 0;
	}
}

// esta clase no necesita test
