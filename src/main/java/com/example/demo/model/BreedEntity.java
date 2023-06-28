package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "breed")
public class BreedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer breed_id;
    private String breed;

    public BreedEntity() {
    }

    public Integer getBreed_id() {
        return breed_id;
    }

    public void setBreed_id(Integer breed_id) {
        this.breed_id = breed_id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
