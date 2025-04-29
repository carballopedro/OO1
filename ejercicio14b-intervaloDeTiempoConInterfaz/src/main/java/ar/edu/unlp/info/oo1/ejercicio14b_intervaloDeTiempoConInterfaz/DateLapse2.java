package ar.edu.unlp.info.oo1.ejercicio14b_intervaloDeTiempoConInterfaz;

import java.time.LocalDate;

public class DateLapse2 implements DatesInterface {
	
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	
	// “recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	
	// INCLUSIVE: tambien devuelve verdadero si la fecha OTHER es igual a FROM o igual a TO
	public boolean includesDate(LocalDate other) {
		return (other.compareTo(this.from) >= 0) && (other.compareTo(this.getTo()) <= 0);
		
		// usando metodos que devuelven booleans
		// return (other.isEqual(this.from) || other.isAfter(this.from)) && (other.isEqual(this.getTo()) || other.isBefore(this.to));
	}
}
