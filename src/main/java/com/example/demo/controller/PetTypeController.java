package com.example.demo.controller;

import com.example.demo.repository.PetTypeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coto/v1/petType")
public class PetTypeController {

    private final PetTypeRepository petTypeRepository;

    public PetTypeController(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @GetMapping
    public ResponseEntity getAllPetTypes() {
        return ResponseEntity.ok(petTypeRepository.findAll());
    }
}
