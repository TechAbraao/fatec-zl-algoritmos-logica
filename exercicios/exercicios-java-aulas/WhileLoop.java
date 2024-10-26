package com.exercicios.fatec;
import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count = 1, X;
		
		// Enquanto (while) no Java
		while(count <= 5) {
			X = scn.nextInt();
			int R = (X * 3);
			System.out.printf("%d%n", R);
			count++;
		}
		System.out.println("Programa encerrado!");
		scn.close();
	}
}
