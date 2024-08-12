package com.estudos.metodos;

import java.security.SecureRandom;

public class NumerosAleatorios {
    // Classe usada para a geração de números aleatórios de forma segura
    public static void main(String[] args) {
        // Classe usada para a geração de números aleatórios de forma segura
        SecureRandom numerosAleatorios = new SecureRandom();
        // O parâmetro recebido dentro do nextInt() define qual é o intervalo do número aleatório
        int aleatorio = numerosAleatorios.nextInt(4);
        System.out.printf("O número aleatório é: %s", aleatorio);
        //

    }

}
