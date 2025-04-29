package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

//Clase que implementa la interfaz Strategy e implementa el método next

public class LIFO implements Strategy {

	public JobDescription next(List<JobDescription> jobs) {
		if (jobs != null) {
			JobDescription nextJob = jobs.get(jobs.size()-1);
			return nextJob;
		}
		else
			return null;
		
	}
}
