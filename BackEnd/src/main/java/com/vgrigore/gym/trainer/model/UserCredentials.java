package com.vgrigore.gym.trainer.model;

import org.hibernate.validator.constraints.NotEmpty;
import sun.security.util.Password;

import java.io.Serializable;

/**
 * VO presents user account credentials
 *
 */
public class UserCredentials implements Serializable{

    private static final long serialVersionUID = 324300177855540106L;

    @NotEmpty(message = "Login shouldn't be empty")
    private String login;

    @NotEmpty(message = "Password shouldn't be empty")
    private Password password;



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
