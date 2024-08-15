package com.exercicios;
import java.util.Scanner;

public class CalculoVolume {
	public static void main(String[] args) {
		//
		double raio, altura, volume;
		Scanner input = new Scanner(System.in);
		//
		System.out.println("Digite o valor do raio: ");
		raio = input.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = input.nextDouble();
		//
		volume = Math.pow(raio, 2) * Math.PI * altura;
		System.out.printf("Volume = %.2f", volume);
		//
	}
}
