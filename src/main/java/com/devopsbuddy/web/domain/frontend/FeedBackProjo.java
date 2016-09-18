package com.devopsbuddy.web.domain.frontend;

import java.io.Serializable;

/**
 * Created by MahfuzCSE'11 on 18-Sep-16.
 */

public class FeedBackProjo implements Serializable {

    private static final long serialVersionUTD = 1L;

    private String email;
    private String firstName;
    private String lastName;
    private String feedback;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "FeedBackProjo{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
