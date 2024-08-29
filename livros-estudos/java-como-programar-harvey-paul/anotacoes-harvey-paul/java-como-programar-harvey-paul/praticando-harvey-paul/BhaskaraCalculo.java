package com.exercicios.fatec;
import java.util.Scanner;

public class BhaskaraCalculo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a, b, c, delta, raizUm, raizDois;
		//
		a = scn.nextDouble();
		b = scn.nextDouble();
		c = scn.nextDouble();
		delta = (b * b) - (4 * a * c);
		//
		if (delta < 0) {
			//
			System.out.println("\nNão existem raízes que pertencem ao conjunto dos reais.");
		}
		else {
				//
			if (delta == 0) {
				raizUm = -b / (2 * a);
				System.out.printf("\nDuas raízes reais iguais. RaizUm = %f", raizUm);
			}
			else {
				//
				if (delta > 0) {
					raizUm = (-b + Math.sqrt(delta)) / 2 * a;
					raizDois = (-b - Math.sqrt(delta)) / 2 * a;
					System.out.printf("\nDuas raízes iguais e distintas. RaizUm = %f e RaizDois = %f", raizUm, raizDois);
				}
			}
		}
	}
}
