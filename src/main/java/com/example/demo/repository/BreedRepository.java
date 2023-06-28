package com.example.demo.repository;

import com.example.demo.model.BreedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<BreedEntity, Integer> {
}
