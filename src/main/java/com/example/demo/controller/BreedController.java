package com.example.demo.controller;

import com.example.demo.repository.BreedRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coto/v1/breeds")
public class BreedController {

    private final BreedRepository breedRepository;

    public BreedController(BreedRepository breedRepository) {
        this.breedRepository = breedRepository;
    }

    @GetMapping
    public ResponseEntity getAllBreeds() {
        return ResponseEntity.ok(breedRepository.findAll());
    }


}
