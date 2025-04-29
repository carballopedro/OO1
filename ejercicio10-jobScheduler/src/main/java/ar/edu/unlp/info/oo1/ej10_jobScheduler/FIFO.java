package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

// Clase que implementa la interfaz Strategy e implementa el método next

public class FIFO implements Strategy{

	public JobDescription next(List<JobDescription> jobs) {
		if (jobs != null) {
			JobDescription nextJob = jobs.get(0);
			return nextJob;
		}
		else
			return null;
		
	}
}
