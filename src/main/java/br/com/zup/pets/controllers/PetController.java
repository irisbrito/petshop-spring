package br.com.zup.pets.controllers;

import br.com.zup.pets.models.Pet;
import br.com.zup.pets.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("petshop/")
public class PetController {

    @Autowired
    PetService petService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet adicionarPet(@RequestBody Pet pet){
        Pet objetoPet = petService.adicionarPet(pet);
        return pet;
    }
}
