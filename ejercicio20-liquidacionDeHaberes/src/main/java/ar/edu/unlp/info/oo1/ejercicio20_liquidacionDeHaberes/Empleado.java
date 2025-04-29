package ar.edu.unlp.info.oo1.ejercicio20_liquidacionDeHaberes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empleado {

	private String nombre;
	private String apellido;
	private String cuil;
	private LocalDate fechaNac;
	private boolean hijosACargo;
	private List<Contrato> contratos;
	
	
	public Empleado(String nombre, String apellido, String cuil, LocalDate fechaNac, boolean hijosACargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNac = fechaNac;
		this.hijosACargo = hijosACargo;
		this.contratos = new ArrayList<Contrato>();
	}
	
	// agregar contrato
	// se devuelve boolean para testear
	public boolean agregarContrato(Contrato contrato) {
		// si no tiene ningun contrato vigente
		// asumo que no se intentan agregar contratos no vigentes viejos
		if (this.contratoVigente() == null) {
			this.contratos.add(contrato);
			//System.out.print("Se ha agregado el contrato");
			return true;
		}else {
			//System.out.print("El empleado ya tiene un contrato vigente");
			return false; }
	}	
	
	// remover contrato
	//public void removerContrato(Contrato contrato) {
	//	this.contratos.remove(contrato);
	//}
	
	// devuelve contrato vigente del empleado si tiene, null caso contrario
	public Contrato contratoVigente() {
		return this.contratos.stream()
				.map(contrato -> contrato.estaVigente())
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}
	
	
	// la antigüedad de un empleado se calcula como la suma de las duraciones de cada uno de los contratos registrados
	public int calcularAntiguedad() {
		return this.contratos.stream().mapToInt(contrato -> contrato.calcularDuracionContrato()).sum();
	}
	
	// calcula sueldo basico de empleado (del contrato vigente)
	public double calcularSueldoBasico() {
		Contrato c = this.contratoVigente();
		 return (c != null)? c.calcularSueldoBasico() : 0;
	}
	
	// CALCULA ADICIONAL
	// adicional se calcula cuando la antiguedad alcanza: 5 años 30%, 10 años 50%, 15 años 70%, 20 años 100%
	public double calcularAdicional() {
		int antiguedad = this.calcularAntiguedad();
		double sueldoBasico = this.calcularSueldoBasico();
		return (antiguedad >= 20)? sueldoBasico : 
			(antiguedad >= 15)? sueldoBasico * 0.7 : 
			(antiguedad >= 10)? sueldoBasico * 0.5 :
			(antiguedad >= 5)? sueldoBasico * 0.3: 0;
	}
	
	// CALCULA MONTO TOTAL
	public double calcularMontoTotal() {
		return this.calcularSueldoBasico() + this.calcularAdicional();
	}
		
	// generar recibo de sueldo
	public ReciboDeSueldo generarReciboDeSueldo() {
		
		if (this.contratoVigente() != null) {
			ReciboDeSueldo r = new ReciboDeSueldo(this.nombre, this.apellido, this.cuil, this.calcularAntiguedad(), this.calcularMontoTotal());
			//System.out.print("Se ha generado el recibo de sueldo");
			return r;
		}else {
		//System.out.print("El empleado no tiene contrato vigente");
		return null; }
	}
	
	// podria pasarle al empleado por parametro en vez del nombre, apellido, cuil, etc
	// decision de diseño
	
	
}
