package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.training.Exercise;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation gives overview or full description
 * for existing in the storage exercises.
 */
@Service
public class ExerciseServiceImpl implements ExerciseService {


    @Override
    public Exercise getExercise(long excId) {
        return null;
    }

    @Override
    public List<Exercise> getAllExercises() {
        return null;
    }
}
