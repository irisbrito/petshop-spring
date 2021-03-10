package br.com.zup.pets.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Pet {
    @NotEmpty(message = "O nome não pode estar vazio")
    @NotNull(message =  "O nome é um campo obrigatório")
    private String nome;

    @NotEmpty(message = "A raça não pode estar vazio")
    @NotNull(message =  "Raça é um campo obrigatório")
    private String raca;

    private String especie;

    private LocalDate dataDeEntrada;
    @NotEmpty(message = "O nome do dono não pode estar vazio")
    @NotNull(message =  "O nome do dono é um campo obrigatório")
    private String nomeDoDono;

    @Email
    private String emailDoDono;
    private String telefoneDoDono;

    public Pet() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public String getEmailDoDono() {
        return emailDoDono;
    }

    public void setEmailDoDono(String emailDoDono) {
        this.emailDoDono = emailDoDono;
    }

    public String getTelefoneDoDono() {
        return telefoneDoDono;
    }

    public void setTelefoneDoDono(String telefoneDoDono) {
        this.telefoneDoDono = telefoneDoDono;
    }
}
