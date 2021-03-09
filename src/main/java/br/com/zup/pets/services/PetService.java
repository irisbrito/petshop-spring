package br.com.zup.pets.services;

import br.com.zup.pets.models.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private List<Pet> pets = new ArrayList<>();

    public Pet adicionarPet(Pet pet){
        pets.add(pet);
        return pet;
    }
}
