package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @Size(max = 500, message = "Description too long!")
    @Valid
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill() {
    }
}