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

    public Pet pesquisarPetPeloEmail(String emailDoDono) {
        for (Pet pet : pets) {
            if (pet.getEmailDoDono().equals(emailDoDono)) {
                return pet;
            }
        }
        throw new RuntimeException("Pet não encontrado");
    }

    public Pet pesquisarPetPeloNomeDoDono(String nomeDoDono){
        for (Pet pet : pets){
            if(pet.getNomeDoDono().equalsIgnoreCase(nomeDoDono)){
                return pet;
            }
        }
        throw new RuntimeException("Pet não encontrado");
    }

    public Pet pesquisarPetPeloNome(String nome){
        for(Pet pet : pets){
            if(pet.getNome().equalsIgnoreCase(nome)){
                return pet;
            }
        }
        throw new RuntimeException("Pet não encontrado");
    }
}
