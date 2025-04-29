package ar.edu.unlp.info.oo1.ejercicio15_distribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	// variables
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	private CuadroTarifario cuadro;
	private Factura factura;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<Consumo>();
	}
	
	// getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	// lo necesito para el test
	public void setCuadro(CuadroTarifario cuadro) {
		this.cuadro = cuadro;
	}
	
	//NO SE SUELEN HACER GETTERS DE TODAS LAS LISTAS / NI SETTERS / SOLO ADD
	// devuelve lista de todos los consumos
	//	return this.consumos;
	//}
	
	// agrega consumo
	public void addConsumo(Consumo consumo) {
		this.consumos.add(consumo);
	}
	
	// se tiene en cuenta solo su último consumo registrado
	// El costo del consumo se calcula multiplicando el consumo de energía activa por el 
	// precio del kWh proporcionado por el cuadro tarifario.
	public double getCostoConsumo() {
		return this.consumos.getLast().getConsumoEnergiaActiva() * this.cuadro.getPrecioKwh();
	}
	
	// consulta si obtuvo bonificacion
	public boolean obtieneBonificacion() {
		return this.consumos.getLast().bonificacion();
		
	}
	
	// Para emitir la factura de un cliente se tiene en cuenta solo su último consumo registrado
	public Factura emitirFactura() {
		double costo = this.getCostoConsumo();
		double bonificacion = 0;
		
		// si obtiene bonificacion se actualiza la variable bonificacion y se le resta la misma al costo
		if (obtieneBonificacion()) {
			bonificacion = costo * 0.10;
			costo = costo - bonificacion;
		}
		
		// creo la factura con bonificacion y costo
		// la almaceno en mi variable y la devuelvo
		this.factura = new Factura(bonificacion, costo);
		return this.factura;
		
	}

}
