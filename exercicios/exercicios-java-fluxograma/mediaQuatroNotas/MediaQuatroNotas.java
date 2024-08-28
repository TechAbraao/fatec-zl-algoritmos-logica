package com.exercicios.fatec;
import java.util.Scanner;

public class MediaQuatroNotas {
    public static void main(String[] args){
        double x, y, z, n, m, media, novaMedia;
        Scanner scn = new Scanner(System.in);

        x = scn.nextDouble();
        y = scn.nextDouble();
        z = scn.nextDouble();
        n = scn.nextDouble();
        media = (x + y + z + n) / 4;
        if (media >= 7) {
            System.out.println("Aprovado com média: " + media);
        } else {
            m = scn.nextDouble();
            novaMedia = (m + media) / 2;
            if (novaMedia >= 5) {
                System.out.println("Aprovado em exame com média: " + novaMedia);
            } else {
                System.out.println("Reprovado com média: " + novaMedia);
            }
        }
        scn.close();
    }
}
