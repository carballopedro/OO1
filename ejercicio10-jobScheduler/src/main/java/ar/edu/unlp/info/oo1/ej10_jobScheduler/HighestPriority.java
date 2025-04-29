package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;


//Clase que implementa la interfaz Strategy e implementa el método next

public class HighestPriority implements Strategy {

	public JobDescription next(List<JobDescription> jobs) {
		if (jobs != null) {
			JobDescription nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
			return nextJob;
		}
		else
			return null;
		
	}
}
