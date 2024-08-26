package com.estudos.arrayList;

import java.util.ArrayList;

public class PessoaArrayList {
    // Instancias privadas da classe 'Pessoa'
    private String nome;
    private String sobrenome;
    private int idade;

    // Construtor da classe 'Pessoa'
    public PessoaArrayList(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Sobrenome: " + this.sobrenome + " - Idade: " + this.idade;
    }

    public static void main(String[] args) {
        PessoaArrayList pessoa1 = new PessoaArrayList("Abraão", "Vitor", 22);
        PessoaArrayList pessoa2 = new PessoaArrayList("Cibéria", "Santos", 33);
        PessoaArrayList pessoa3 = new PessoaArrayList("Laisa", "Santos", 29);
        //
        ArrayList<PessoaArrayList> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        //
        System.out.println(listaPessoas.get(0).toString());
        System.out.println(listaPessoas.get(1).toString());
        System.out.println(listaPessoas.get(2).toString());
        System.out.println(listaPessoas.size());
        System.out.println(listaPessoas.get(2));
        //
    }
}
