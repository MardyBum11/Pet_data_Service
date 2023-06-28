package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet_type")
public class PetTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pet_type_id;
    private String pet_type;

    public PetTypeEntity() {
    }

    public Integer getPet_type_id() {
        return pet_type_id;
    }

    public void setPet_type_id(Integer pet_type_id) {
        this.pet_type_id = pet_type_id;
    }

    public String getPet_type() {
        return pet_type;
    }

    public void setPet_type(String pet_type) {
        this.pet_type = pet_type;
    }
}
