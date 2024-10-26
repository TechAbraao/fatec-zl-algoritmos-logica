package com.estudos.arrays;

public class InicializadorArray {
    public static void main(String[] args) {
        // Declarando um array e inicializando com seus respectivos valores em String
        String[] nomes = {"Abraão S.", "José T.", "Rosangela T."};
        //
        for(int c = 0; c < nomes.length; c++){
            System.out.printf("Index = %d - Elemento = %s%n", c, nomes[c]);
        }
    }
}
