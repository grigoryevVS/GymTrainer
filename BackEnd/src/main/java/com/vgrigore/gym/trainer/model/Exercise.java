package com.vgrigore.gym.trainer.model;

import java.io.Serializable;
import java.net.URL;


/**
 * Represents VO for the exercise.
 * Should contain description notes for the target exercise
 *
 */
public class Exercise implements Serializable{

    private static final long serialVersionUID = 4656163509259162285L;


    private String name;

    private String shortDescription;

    private String longDescription;

    private URL imageUrl;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
