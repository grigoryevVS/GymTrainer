package com.vgrigore.gym.trainer.model;

import java.io.Serializable;
import java.util.Date;


/**
 * Represents VO for the UserAccount.
 * contains general information about user ( name, age, birthday )
 * and important object references like: metrics, etc.
 *
 */
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1578971944503780078L;


    private String firstName;

    private String lastName;

    private int age;

    private Date birthday;

    private Metrics metrics;

    private UserCredentials credentials;




    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Metrics getMetrics() {
        return this.metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public UserCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(UserCredentials credentials) {
        this.credentials = credentials;
    }
}
