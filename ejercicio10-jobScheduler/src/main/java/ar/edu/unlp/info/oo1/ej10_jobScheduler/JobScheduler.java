package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;

    public JobScheduler (Strategy strategy) {
        this.jobs = new ArrayList<JobDescription>();
        this.strategy = strategy;
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Strategy getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    // la estrategia no puede cambiar. se inicializa con el constructor
    //public void setStrategy(Strategy aStrategy) {
    //    this.strategy = aStrategy;
    //}

    // se modificó el método next
    // habîa codigo repetido y una sentencia swift/case no recomendada en objetos
  
    public JobDescription next() {
        JobDescription nextJob = this.strategy.next(this.jobs);
        this.unschedule(nextJob);
        return nextJob;
    }

}