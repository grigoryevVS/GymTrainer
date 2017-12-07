package com.vgrigore.gym.trainer.model.training;

import java.io.Serializable;
import java.util.Set;

/**
 * VO presents whole training program
 *
 */
public class TrainingProgram implements Serializable {

    private static final long serialVersionUID = 3746348974881300941L;


    /** Name of the program */
    private String name;

    /** Set of training days */
    private Set<TrainingDay> trainingDays;



    public Set<TrainingDay> getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(Set<TrainingDay> trainingDays) {
        this.trainingDays = trainingDays;
    }
}
