package com.vgrigore.gym.trainer.model.training;

import java.io.Serializable;
import java.net.URL;


/**
 * Represents VO for the exercise.
 * Should contain description notes for the target exercise
 *
 */
public class Exercise implements Serializable{

    private static final long serialVersionUID = 4656163509259162285L;


    /** Name of the exercise */
    private String name;

    /** Muscle for which this exercise applies */
    private Muscle muscle;

    /** Short description */
    private String shortDescription;

    /** Long description */
    private String longDescription;

    /** Url leading to the image of exercise */
    private URL imageUrl;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Muscle getMuscle() {
        return muscle;
    }

    public void setMuscle(Muscle muscle) {
        this.muscle = muscle;
    }

    public URL getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
