package com.vgrigore.gym.trainer.model.training;

import java.io.Serializable;

/**
 * VO presents 1 set for the concrete exercise within
 * one training day
 */
public class ExerciseSet implements Serializable {

    private static final long serialVersionUID = 7275202706106423836L;


    /** Exercise for current set */
    private Exercise exercise;

    /** Weight of the снаряда */
    private double weight;

    /** Number of iterations within one set */
    private int iterations;

    /** Number of seconds for the rest after set */
    private int rest;


    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }
}
