package ar.edu.unlp.info.oo1.ejercicio14b_intervaloDeTiempoConInterfaz;

import java.time.LocalDate;

// interfaz implementada por DateLapse1 y DateLapse2 (comparten 3 metodos pero diferentes con diferente implementacion)
// podria ser una clase abstracta ya que tienen la misma variable de instancia from y el metodo getFrom con el mismo comportamiento

public interface DatesInterface {
	
	public LocalDate getTo();
	
	public int sizeInDays();
	
	public boolean includesDate(LocalDate other);
}
