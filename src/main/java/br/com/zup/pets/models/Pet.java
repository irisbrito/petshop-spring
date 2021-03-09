package br.com.zup.pets.models;

import java.time.LocalDate;

public class Pet {
    private String nome;
    private String raca;
    private String especie;
    private LocalDate dataDeEntrada;
    private String nomeDoDono;
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
