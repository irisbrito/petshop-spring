package br.com.zup.pets.controllers;

import br.com.zup.pets.models.Pet;
import br.com.zup.pets.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("petshop/")
public class PetController {

    @Autowired
    PetService petService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet adicionarPet(@RequestBody Pet pet){
        Pet objetoPet = petService.adicionarPet(pet);
        return objetoPet;
    }

    @GetMapping ("/buscaPeloEmail/{email}/")
    public Pet retornarPetPeloEmail(@PathVariable String email){
        Pet objetoPet = petService.pesquisarPetPeloEmail(email);
        return objetoPet;
    }

    @GetMapping("/buscaPeloNome/{nome}/")
    public List<Pet> pesquisarPetPeloNome(@PathVariable String nome){
        List<Pet> listaDePets = petService.pesquisarPetPeloNome(nome);
        return listaDePets;
    }

    @GetMapping("/buscaPeloDono/{nomeDoDono}/")
    public List<Pet> pesquisarPetPeloDono(@PathVariable String nomeDoDono){
        List<Pet> petsDoMesmoDono = petService.pesquisarPetPeloNomeDoDono(nomeDoDono);
        return petsDoMesmoDono;
    }


}
