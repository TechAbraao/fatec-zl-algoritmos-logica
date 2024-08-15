package com.exercicios;

import java.util.Scanner;

public class MediaRespectivasNotas {
	public static void main(String[] args) {
		// Ínicio
		double N1, N2, M;
		Scanner scn = new Scanner(System.in);
		//
		N1 = scn.nextDouble();
		N2 = scn.nextDouble();
		M = ((N1 * 2) + (N2 * 4)) / (2 + 4);
		//
		System.out.println(M);
		scn.close();
		// Fim
	}
}
