package com.beecrowd;
import java.util.Scanner;

public class BhaskaraBeecrowd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double A, B, C, delta, x1, x2;

        A = scn.nextDouble();
        B = scn.nextDouble();
        C = scn.nextDouble();

        delta = (B * B) - (4 * A * C);
        System.out.println(delta);
        if (A == 0 && delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = (-B + Math.sqrt(delta)) / 2 * A;
            x2 = (-B - Math.sqrt(delta)) / 2 * A;
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }
    }
}
