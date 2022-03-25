package org.launchcode.techjobs.persistent.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    @NotNull
//    @Valid
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
