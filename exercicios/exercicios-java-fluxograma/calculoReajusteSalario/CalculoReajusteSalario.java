package com.exercicios;
import java.util.Scanner;

public class CalculoReajusteSalario {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double SALARIO, NOVO_SALARIO;
		SALARIO = scn.nextDouble();
		// Execu��o do fluxo condicional
		if (SALARIO < 500) {
			// Sal�rio menor que R$ 500,00
			NOVO_SALARIO = SALARIO + (SALARIO * 15.0 / 100.0);
		} else {
			if (500 >= SALARIO && SALARIO <= 1000) {
				// Sal�rio maior que R$ 500,00 ou igual e menor ou igual a R$ 1000,00
				NOVO_SALARIO = SALARIO + (SALARIO * 10.0 / 100.0);
			} else {
				// Sal�rio maior que R$ 1000,00
				NOVO_SALARIO = SALARIO + (SALARIO * 5.0 / 100.0);
			}
		}
		System.out.printf("Novo sal�rio com reajuste: R$ %.2f%n", NOVO_SALARIO);
		scn.close();
	}
}