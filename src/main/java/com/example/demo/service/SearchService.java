package com.example.demo.service;

import com.example.demo.model.SearchEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class SearchService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public SearchEntity findById(Integer petId){
        return entityManager.find(SearchEntity.class, petId);
    }
}
