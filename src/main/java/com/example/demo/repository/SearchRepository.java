package com.example.demo.repository;

import com.example.demo.model.SearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface SearchRepository extends JpaRepository<SearchEntity, Integer> {
}
