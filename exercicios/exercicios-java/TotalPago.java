package com.exercicios;
import java.util.Scanner;

public class TotalPago {
	public static void main(String[] args) {
		//
		double Pu, Total;
		int Qt;
		Scanner input = new Scanner(System.in);
		//
		System.out.println("Digite o preço unitário: ");
		Pu = input.nextDouble();
		System.out.println("Digite a quantidade: ");
		Qt = input.nextInt();
		//
		Total = Pu * Qt;
		System.out.printf("Total = %.2f", Total);
		//
		input.close();
	}
}
