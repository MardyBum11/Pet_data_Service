package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "owner_info")
public class OwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer owner_id;
    private String name;
    private Integer house_number;
    private Integer telephone;

    public OwnerEntity() {
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHouse_number() {
        return house_number;
    }

    public void setHouse_number(Integer house_number) {
        this.house_number = house_number;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}
