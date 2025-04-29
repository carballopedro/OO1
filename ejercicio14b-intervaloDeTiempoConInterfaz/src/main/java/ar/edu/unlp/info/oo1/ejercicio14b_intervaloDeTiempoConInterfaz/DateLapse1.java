package ar.edu.unlp.info.oo1.ejercicio14b_intervaloDeTiempoConInterfaz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse1 implements DatesInterface {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse1 (LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	// “retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	// uso (int) para castear a integer ya que ChronoUnit.DAYS.between devuelve double
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	// “recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	
	// INCLUSIVE: tambien devuelve verdadero si la fecha OTHER es igual a FROM o igual a TO
	public boolean includesDate(LocalDate other) {
		return (other.compareTo(this.from) >= 0) && (other.compareTo(this.to) <= 0);
		
		// usando metodos que devuelven booleans
		// return (other.isEqual(this.from) || other.isAfter(this.from)) && (other.isEqual(this.to) || other.isBefore(this.to));
	}
 
}
