package com.estudos.arrays;

import java.util.Scanner;

public class TabuadaArray {
    public static void main(String[] args) {
        // Instanciando um objeto array com espaço de 10 elementos na memória
        final int ARRAY_LENGTH = 10;
        int[] numerosTabuada = new int[ARRAY_LENGTH];

        // Usando o 'for' para mostrar a tabuada em ação
        int addNumber = 0;
        for(int i = 0; i < numerosTabuada.length; i++){
            //
            addNumber++;
            numerosTabuada[i] += addNumber;
            System.out.printf("No índice %d foi adicionado o número %d%n", i, addNumber);
            //
        }
        // Verificar se foi adicionado
        System.out.printf("Verificação: %d\n", numerosTabuada[1]);
        // Usando o for pra tabuada
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que deseja multiplicar na tabuada do 1 até 10: \n");
        final int valorTabuada = input.nextInt();
        for (int i = 0; i < numerosTabuada.length; i++){
            //
            int resultado = (valorTabuada * numerosTabuada[i]);
            System.out.printf("%d x %d = %d%n", valorTabuada, numerosTabuada[i], resultado);
        }
    }
}
