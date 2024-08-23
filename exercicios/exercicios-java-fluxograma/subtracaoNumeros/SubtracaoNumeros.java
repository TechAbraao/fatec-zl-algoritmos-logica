package com.exercicios;
import java.util.Scanner;

public class SubtracaoNumeros {
	public static void main (String[] args) {
		
		// Instanciando o objeto input
		Scanner input = new Scanner(System.in);
		int N1, N2, M;
		
		// Entrada de dados de N1 e N2
		System.out.println("Digite o primeiro número: ");
		N1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		N2 = input.nextInt();
		M = N1 - N2;
		
		// Mostrar na tela do usuário
		System.out.println("Resultado = " + M);
		
		input.close();
	}
}
