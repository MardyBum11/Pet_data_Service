package com.example.demo.controller;

import com.example.demo.model.BreedEntity;
import com.example.demo.model.PetEntity;
import com.example.demo.model.PetTypeEntity;
import com.example.demo.repository.PetRepository;
import com.example.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.util.ReflectionUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Map;

@RestController
@RequestMapping("/coto/v1/pets")
public class PetController {

    @Autowired
    private PetService petService;
    private final PetRepository petRepository;

    public PetController(PetRepository productRepository) {
        this.petRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity getAllPets() {
        return ResponseEntity.ok(this.petRepository.findAll());
    }

    @GetMapping("pet/{petId}")
    @ResponseBody
    public PetEntity searchPetById(@PathVariable("petId") Integer petId) {
        PetEntity petEntity = validateId(petId);
        return this.petService.findById(petId);
    }

    @PostMapping("pet/new")
    public PetEntity addNewPet(@RequestBody PetEntity petEntity) {
        return petRepository.save(petEntity);

    }

    @PutMapping("pet/update/{id}")
    public ResponseEntity<PetEntity> updateElement(@PathVariable(value = "id") Integer petId,
                                                   @RequestBody PetEntity petEntityDetails) {
        PetEntity petEntity = validateId(petId);

        final PetEntity updatePetInfo = petRepository.save(petService
                .updateCompletePetInfo(petEntityDetails,  petEntity ));

        return ResponseEntity.ok(updatePetInfo);
    }

    @PatchMapping("pet/update/field/{petId}")
    public PetEntity updatePetName(@PathVariable Integer petId, @RequestBody Map<String, Object> petInfo) {

        PetEntity petEntity = validateId(petId);

        petInfo.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(PetEntity.class, key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, petRepository.findById(petId).get(), value);
        });
        return petRepository.save(petRepository.findById(petId).get());

}

@DeleteMapping("pet/delete/{petId}")
    public String deletePet(@PathVariable Integer petId) {
        PetEntity petEntity = validateId(petId);

        petRepository.deleteById(petId);

        return "Element was deleted";
}

    public  PetEntity validateId(Integer petId) {
        return petRepository.findById(petId).orElseThrow(() ->
                new InvalidConfigurationPropertyValueException("Pet Entity: ", petId, " Pet was not found "));
    }



}
