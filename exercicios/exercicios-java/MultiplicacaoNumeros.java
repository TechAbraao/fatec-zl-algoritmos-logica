package com.exercicios;
import java.util.Scanner;

public class MultiplicacaoNumeros {
	public static void main (String[] args) {
		//
		final double N1, N2, R;
		Scanner input = new Scanner(System.in);
		//
		System.out.println("Digite o primero número: ");
		N1 = input.nextDouble();
		System.out.println("Digite o segundo número: ");
		N2 = input.nextDouble();
		//
		R = N1 * N2;
		//
		System.out.printf("Resultado da multiplicação: %.2f", R);
		input.close();
	}
}
