package com.beecrowd;
import java.util.Scanner;

public class AlgortimoEBeecrowd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A, B, C, D;
        A = scn.nextInt();
        B = scn.nextInt();
        C = scn.nextInt();
        D = scn.nextInt();
        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
