package ar.edu.unlp.info.oo1.ejercicio23_mercadoDeObjetos;

public class PagoEn6Cuotas implements FormaDePago {

	// 1.2 (120% ya que se cobra un 20% adicional)
	public double getPrecioFinal() {
		return 1.2;
	}
}

// esta clase no necesita test