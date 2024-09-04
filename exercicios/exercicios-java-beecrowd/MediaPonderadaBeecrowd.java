package com.beecrowd;
import java.util.Scanner;

public class MediaPonderadaBeecrowd {
    public static void main(String[] args) {
        float N1, N2, N3, N4, media, notaExame;
        Scanner scn = new Scanner(System.in);
        N1 = scn.nextFloat();
        N2 = scn.nextFloat();
        N3 = scn.nextFloat();
        N4 = scn.nextFloat();
        media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        System.out.printf("Media: %.1f%n", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            notaExame = scn.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            media = (media + notaExame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", media);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", media);
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
