package com.example.demo.repository;

import com.example.demo.model.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer> {
}
