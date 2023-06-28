package com.example.demo.service;

import com.example.demo.model.PetEntity;
import com.example.demo.model.PetTypeEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PetService {

    @PersistenceContext
            //Trabaja con la DB y se encargara de las operaciones
    EntityManager entityManager;
    public PetEntity findById(Integer pet_id) {

        return entityManager.find(PetEntity.class, pet_id);
    }

    public PetEntity updateCompletePetInfo(PetEntity petEntityDetails, PetEntity petEntity) {
        petEntity.setPet_id(petEntityDetails.getPet_id());
        petEntity.setPetType(petEntityDetails.getPetType());
        petEntity.setBreed(petEntityDetails.getBreed());
        petEntity.setPet_name(petEntityDetails.getPet_name());
        petEntity.setPhoto(petEntityDetails.getPhoto());

        return petEntity;
    }
}
