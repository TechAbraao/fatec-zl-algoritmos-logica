package com.estudos.metodos;

// Algoritmo que verifica o maior e menor valor e retorna o maior valor

import java.util.Scanner;

public class AlgoritmoMaiorMenor {

    // Classe static, sem a necessidade de instânciar um objeto
    public static int numberReturn(int a, int b) {
        int bigNumber = 0;
        if (a > b) {
            bigNumber = a;
            System.out.printf("Número %d é maior que %d\n", a, b);
        }
        if (b > a) {
            bigNumber = b;
            System.out.printf("O número %d é maior que %d\n", b, a);
        }
        //
        return bigNumber;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //
        int _a = scn.nextInt();
        int _b = scn.nextInt();
        //
        System.out.println("O maior valor digitado é: " + AlgoritmoMaiorMenor.numberReturn(_a, _b));
    }
}
