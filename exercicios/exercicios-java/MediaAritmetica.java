package com.exercicios;
import java.util.Scanner;

public class MediaAritmetica {
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		double N1, N2, M;
		//
		System.out.println("Digite a primeira nota: ");
		N1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		N2 = input.nextDouble();
		//
		M = (N1 + N2) / 2;
		//
		System.out.printf("Média aritmética = %.2f", M);
		//
		input.close();
	}
}
