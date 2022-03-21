package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {
    }

    @OneToOne
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
