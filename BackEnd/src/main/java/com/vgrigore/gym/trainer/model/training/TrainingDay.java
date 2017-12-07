package com.vgrigore.gym.trainer.model.training;

import java.io.Serializable;
import java.util.List;

/**
 * Training day presents list of exercises combined in 1 training
 */
public class TrainingDay implements Serializable {

    private static final long serialVersionUID = 4085298877414243918L;


    /** Name of the training day */
    private String name;

    /** List of exercises to be done within current training */
    private List<TrainingDayEntry> exercises;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TrainingDayEntry> getExercises() {
        return exercises;
    }

    public void setExercises(List<TrainingDayEntry> exercises) {
        this.exercises = exercises;
    }
}
