package com.exercicios.fatec;
import java.util.Scanner;

public class FormulaBhaskara {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a, b, c, delta, raizUm, raizDois;
		//
		a = scn.nextDouble();
		b = scn.nextDouble();
		c = scn.nextDouble();
		delta = (b * b) - (4 * a * c);
		//
		if (delta < 0) System.out.println("\n Não existem raízes que pertencem ao conjunto dos reais.");
		else {
			if (delta == 0) System.out.println("\n Duas raízes reais iguais.");
			else {
				if (delta > 0) System.out.println("\n Duas raízes iguais e distintas");
			}
		}
	}
}
