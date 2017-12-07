package com.vgrigore.gym.trainer.model.training;

import java.io.Serializable;
import java.util.List;

/**
 * VO presents 1 exercise entry in the training day.
 * Contains exercise, number of sets...
 */
public class TrainingDayEntry implements Serializable {

    private static final long serialVersionUID = -1735389821029049445L;


    /** Name which can match to the exercise name */
    private String name;

    /** List of exercise set, describing: weight/number of iteration on each set */
    private List<ExerciseSet> exerciseSets;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExerciseSet> getExerciseSets() {
        return exerciseSets;
    }

    public void setExerciseSets(List<ExerciseSet> exerciseSets) {
        this.exerciseSets = exerciseSets;
    }
}
