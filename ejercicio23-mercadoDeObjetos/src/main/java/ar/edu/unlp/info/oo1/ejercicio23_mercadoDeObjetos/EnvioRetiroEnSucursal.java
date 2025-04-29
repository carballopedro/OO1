package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class EnvioRetiroEnSucursal implements FormaDeEnvio {

	// Si la forma de envío es "retirar en sucursal del correo" el costo es de $3000.
	public double getCostoDeEnvio(String origen, String destino) {
		return 3000;
	}
}
// esta clase no necesita test