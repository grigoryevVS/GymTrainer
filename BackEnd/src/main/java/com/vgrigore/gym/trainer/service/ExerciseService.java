package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.training.Exercise;

import java.util.List;

/**
 * Interface defines interaction of
 * user with exercise storage
 * ( get overview about all exercises/ get full description of concrete one )
 */
public interface ExerciseService {

    /**
     * Get concrete exercise full description by passed excId
     */
    Exercise getExercise(long excId);

    /**
     * Get overview of all exercises in the storage
     */
    List<Exercise> getAllExercises();

}
