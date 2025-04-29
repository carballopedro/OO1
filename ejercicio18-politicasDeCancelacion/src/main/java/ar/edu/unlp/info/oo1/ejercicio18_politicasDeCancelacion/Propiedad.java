package ar.edu.unlp.info.oo1.ejercicio18_politicasDeCancelacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	
	// TIENE UNA LISTA DE RESERVAS
	// ESTA CLASE ES LA ENCARGADA DE IMPLEMENTAR LOS METODOS CREAR/CANCELAR RESERVA
	
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private PoliticaCancelacion politica;
	
	public Propiedad(String direccion, String nombre, double precioPorNoche, PoliticaCancelacion politica) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		this.politica = politica;
	}
	
	// NO SON NECESARIOS
	// getters
	//public String getDireccion() {
	//	return this.direccion;
	//}
	
	//public String getNombre() {
	//	return this.nombre;
	//}
	
	//public double getPrecioPorNoche() {
	//	return this.precioPorNoche;
	//}
	
	// NO NECESITO SETTERS YA QUE TENGO CONSTRUCTOR
	// SALVO QUE EL EJERCICIO ME LO PIDA ESPECIFICAMENTE PARA UN FUTURO CAMBIO DE VALOR DE UNA INSTANCIA
	// setters
	//public void setDireccion(String direccion) {
	//	this.direccion = direccion;
	//}
	
	//public void setNombre(String nombre) {
	//	this.nombre = nombre;
	//}
	
	//public void setPrecioPorNoche(double precioPorNoche) {
	//	this.precioPorNoche = precioPorNoche;
	//}
	
	// setter para politica de cancelacion
	public void setPoliticaDeCancelacion(PoliticaCancelacion politica) {
		this.politica = politica;
	}
	
	// addReserva
	public void addReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	// eliminaReserva
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	// CONSULTA DISPONIBILIDAD
	// devuelve TRUE si esta disponible, es decir, si el periodo pasado por parametros no se superpone con NINGUNA reserva
	public boolean estaDisponible(LocalDate fechaInicial, LocalDate fechaFinal) {
		// ALLMATCH = devuelve true si todos los elementos del stream satisfacen el predicado que se recibe como parámetro
		return this.reservas.stream().allMatch(reserva -> reserva.seSuperpone(fechaInicial, fechaFinal) == false);
	}
	
	// calcula ingresos de las reservas de una propiedad (dentro de un periodo de tiempo)
	public double calcularIngresosPropiedad(LocalDate fechaInicial, LocalDate fechaFinal) {
		return this.reservas.stream().
				filter(reserva -> reserva.estaEntre(fechaInicial, fechaFinal) == true).
				mapToDouble(reserva -> reserva.calcularPrecio()).
				sum();
	}
	
	// crear reserva si está disponible
	public void crearReserva(LocalDate fechaInicial, LocalDate fechaFinal) {
		// se fija que este disponible en esa fechas
		if (this.estaDisponible(fechaInicial, fechaFinal)) {
			Reserva reserva = new Reserva(fechaInicial, fechaFinal, this.precioPorNoche);
			this.addReserva(reserva);
		}
	}
	
	// elimina reserva si no esta en curso y reembolsa un monto en caso de que corresponda 
	public double cancelarReserva(Reserva reserva) {
		if (reserva.estaEnCurso() == false) {
			this.eliminarReserva(reserva);
			System.out.print("Se cancela la reserva correctamente");
			// reembolsa en caso de que corresponda
			return this.politica.cancelacion(reserva.calcularPrecio(), reserva.getFechaInicial());
		}
		else
			{ 
			System.out.print("La reserva no se puede cancelar (está en curso)");
			return 0;
			}
	}
}
