package com.exercicios.fatec;
import java.util.Scanner;

public class SenhorOuSenhora {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String nome, sexo;

        nome = scn.next();
        sexo = scn.next();

        if (sexo.equals("masculino")) {
            System.out.println("Bem-vindo, Ilmo. Sr. " + nome);
        } else {
            System.out.println("Bem-vinda, Ilma. Sra. " + nome);
        }
    }
}
