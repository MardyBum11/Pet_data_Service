package com.example.demo.model;

import javax.persistence.*;


@Entity
@Table(name = "pet_info")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer pet_id;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "pet_type_id")
    private PetTypeEntity petType;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "breed_id")
    private BreedEntity breed;
    private String pet_name;
    private String photo;

    public PetEntity() {
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public PetTypeEntity getPetType() {
        return petType;
    }

    public void setPetType(PetTypeEntity petType) {
        this.petType = petType;
    }

    public BreedEntity getBreed() {
        return breed;
    }

    public void setBreed(BreedEntity breed) {
        this.breed = breed;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
