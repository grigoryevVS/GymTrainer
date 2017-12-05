package com.vgrigore.gym.trainer.model;

import java.io.Serializable;

/**
 * VO present metrics of human leg.
 */
public class LegMetrics implements Serializable {

    private static final long serialVersionUID = -2870140660108293887L;

    private double thigh;
    private double calve;



    public double getThigh() {
        return this.thigh;
    }

    public void setThigh(double thigh) {
        this.thigh = thigh;
    }

    public double getCalve() {
        return this.calve;
    }

    public void setCalve(double calve) {
        this.calve = calve;
    }
}
