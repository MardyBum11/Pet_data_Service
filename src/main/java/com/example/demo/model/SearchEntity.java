package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "search")
public class SearchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer search_id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "pet_id")
    private PetEntity petEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    private OwnerEntity ownerEntity;

    public SearchEntity() {    }

    public Integer getSearch_id() {
        return search_id;
    }

    public void setSearch_id(Integer search_id) {
        this.search_id = search_id;
    }

    public PetEntity getPetEntity() {
        return petEntity;
    }

    public void setPetEntity(PetEntity petEntity) {
        this.petEntity = petEntity;
    }

    public OwnerEntity getOwnerEntity() {
        return ownerEntity;
    }

    public void setOwnerEntity(OwnerEntity ownerEntity) {
        this.ownerEntity = ownerEntity;
    }

}
