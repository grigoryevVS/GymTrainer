package com.vgrigore.gym.trainer.model.metrics;

import java.io.Serializable;

/**
 * VO presents human Arm metrics
 */
public class ArmMetrics implements Serializable {

    private static final long serialVersionUID = 8822404254479937680L;

    private double arm;
    private double foreArm;
    private double wrist;



    public double getArm() {
        return this.arm;
    }

    public void setArm(double arm) {
        this.arm = arm;
    }

    public double getForeArm() {
        return this.foreArm;
    }

    public void setForeArm(double foreArm) {
        this.foreArm = foreArm;
    }

    public double getWrist() {
        return this.wrist;
    }

    public void setWrist(double wrist) {
        this.wrist = wrist;
    }
}
