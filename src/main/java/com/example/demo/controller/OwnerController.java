package com.example.demo.controller;

import com.example.demo.repository.OwnerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coto/v1/owners")
public class OwnerController {

    private final OwnerRepository ownerRepository;


    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @GetMapping
    public ResponseEntity getAllOwners() {
        return ResponseEntity.ok(this.ownerRepository.findAll());
    }
}
