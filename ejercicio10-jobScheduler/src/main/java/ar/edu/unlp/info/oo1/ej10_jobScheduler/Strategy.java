package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

// se crea una interfaz Strategy para las 4 clases FIFO, LIFO, MostEffort y HighestPriority que la implementan
// la interfaz define un metodo next, el cual deben implementar las 4 clases que implementan la interfaz Strategy

public interface Strategy {
	
	public JobDescription next(List<JobDescription> jobs);
}
