package com.vgrigore.gym.trainer.model;

import java.io.Serializable;

public class ErrorResponse implements Serializable{

    private static final long serialVersionUID = -3306893821274095251L;

    private String message;

    public ErrorResponse() {}

    public ErrorResponse(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
