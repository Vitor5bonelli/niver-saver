package com.example.niversaver.Model;

import java.util.Date;

public class Aniversariante {
    private final String nome;
    private final Date dataAniversario;
    private String sugestoesPresente;

    public Aniversariante(String nome, Date dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome +
                "\nData de Aniversário: " + dataAniversario +
                "\nSugestoes para Presente='" + sugestoesPresente;
    }

    public void setSugestoesPresente(String sugestoesPresente) {
        this.sugestoesPresente = sugestoesPresente;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public String getSugestoesPresente() {
        return sugestoesPresente;
    }
}
