package com.exercicios;
import java.util.Scanner;

public class MultiplicacaoNumeros {
	public static void main (String[] args) {
		//
		final double N1, N2, R;
		Scanner input = new Scanner(System.in);
		//
		System.out.println("Digite o primero n�mero: ");
		N1 = input.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		N2 = input.nextDouble();
		//
		R = N1 * N2;
		//
		System.out.printf("Resultado da multiplica��o: %.2f", R);
		input.close();
	}
}
