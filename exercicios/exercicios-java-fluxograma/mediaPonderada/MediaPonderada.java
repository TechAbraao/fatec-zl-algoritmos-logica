package com.exercicios;
import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		double N1, N2, M;
		Scanner input = new Scanner(System.in);
		//
		System.out.println("Digite a primeira nota: ");
		N1 = input.nextDouble();
		System.out.println("Digite a primeira nota: ");
		N2 = input.nextDouble();
		//
		M = ((N1 * 4) + (N2 * 6)) / (4 + 6);
		//
		System.out.printf("Média Ponderada: %.2f", M);
		//
		input.close();
	}
}
