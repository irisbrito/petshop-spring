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

    public List<Pet> pesquisarPetPeloEmail(String emailDoDono) {
        List<Pet> petsComMesmoDono = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.getEmailDoDono().equals(emailDoDono)) {
                petsComMesmoDono.add(pet);
                return petsComMesmoDono;
            }
        }
        throw new RuntimeException("Pet não encontrado");
    }

    public List<Pet> pesquisarPetPeloNomeDoDono(String nomeDoDono){
        for (Pet pet : pets){
            if(pet.getNomeDoDono().equalsIgnoreCase(nomeDoDono)){
                List<Pet> petsComMesmoDono = new ArrayList<>();
                petsComMesmoDono.add(pet);
                return petsComMesmoDono;
            }
        }
        throw new RuntimeException("Pet não encontrado");
    }

    public List<Pet> pesquisarPetPeloNome(String nome){
        for(Pet pet : pets){
            if(pet.getNome().equalsIgnoreCase(nome)){
                List<Pet> petsComOMesmoNome = new ArrayList<>();
                petsComOMesmoNome.add(pet);
                return petsComOMesmoNome;
            }
        }
        throw new RuntimeException("Nenhum Pet encontrado com esse nome");
    }

    public Pet deletarPet(String nome, String nomeDoDono){
        for(Pet pet : pets){
            if(pet.getNome().equalsIgnoreCase(nome) && pet.getNomeDoDono().equalsIgnoreCase(nomeDoDono)){
                pets.remove(pet);
                return pet;
            }
        }
        throw new RuntimeException("Pet não encontrado");
    }
}
