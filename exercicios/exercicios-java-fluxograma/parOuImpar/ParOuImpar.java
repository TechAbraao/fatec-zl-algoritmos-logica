package com.exercicios.fatec;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero;

        numero = scn.nextInt();

        if (numero % 2 == 0){
            System.out.println("É par o número " + numero);
        } else {
            System.out.println("É ímpar o número " + numero);
        }
        scn.close();
    }
}
