package com.vgrigore.gym.trainer.model;

import java.io.Serializable;


/**
 * Represents VO for the personal metrics view.
 * Should contain all possible metrics for the person like ( height, weight, hands, legs, etc. )
 *
 */
public class Metrics implements Serializable {

    private static final long serialVersionUID = -8475811191487127355L;


    private double weight;

    private double neck;

    private double shoulders;

    private double chest;

    private ArmMetrics leftArm;

    private ArmMetrics rightArm;

    private double waist;

    private double hips;

    private LegMetrics leftLeg;

    private LegMetrics rightLeg;



    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getNeck() {
        return this.neck;
    }

    public void setNeck(double neck) {
        this.neck = neck;
    }

    public double getShoulders() {
        return this.shoulders;
    }

    public void setShoulders(double shoulders) {
        this.shoulders = shoulders;
    }

    public double getChest() {
        return this.chest;
    }

    public void setChest(double chest) {
        this.chest = chest;
    }

    public ArmMetrics getLeftArm() {
        return this.leftArm;
    }

    public void setLeftArm(ArmMetrics leftArm) {
        this.leftArm = leftArm;
    }

    public ArmMetrics getRightArm() {
        return this.rightArm;
    }

    public void setRightArm(ArmMetrics rightArm) {
        this.rightArm = rightArm;
    }

    public double getWaist() {
        return this.waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getHips() {
        return this.hips;
    }

    public void setHips(double hips) {
        this.hips = hips;
    }

    public LegMetrics getLeftLeg() {
        return this.leftLeg;
    }

    public void setLeftLeg(LegMetrics leftLeg) {
        this.leftLeg = leftLeg;
    }

    public LegMetrics getRightLeg() {
        return this.rightLeg;
    }

    public void setRightLeg(LegMetrics rightLeg) {
        this.rightLeg = rightLeg;
    }
}
