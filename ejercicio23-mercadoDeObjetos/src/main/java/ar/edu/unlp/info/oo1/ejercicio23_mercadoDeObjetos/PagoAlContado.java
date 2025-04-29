package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class PagoAlContado implements FormaDePago {

	// devuelve 1 (100% del producto se cobra)
	public double getPrecioFinal() {
		return 1;
	}
}

// esta clase no necesita test