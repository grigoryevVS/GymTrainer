package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.training.Exercise;
import com.vgrigore.gym.trainer.service.ExerciseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles operations on exercises
 * show full information about every exercise
 */
@RestController
@RequestMapping(value = "/exercises")
public class ExerciseStorageController {

    private ExerciseService exerciseService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ExerciseStorageController.class);

    @Autowired
    public ExerciseStorageController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }


    @RequestMapping(value = "/{excId}")
    public Exercise getExercise(@PathVariable long excId) {
        //todo: logging + handling
        LOGGER.debug("Try to get exercise by given id: {0}", excId);

        return null;
    }

    public ExerciseService getExerciseService() {
        return exerciseService;
    }
}
