package com.example.AssignmentJPA.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "streetnumber")
    private String streetNumber;
    @Column(name = "location")
    private String location;
    @Column(name = "state")
    private String State;

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
