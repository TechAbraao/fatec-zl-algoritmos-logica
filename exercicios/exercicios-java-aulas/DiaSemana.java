package com.exercicios.fatec;
import java.util.ArrayList;
import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<String> diaSemana = new ArrayList<String>();
		// Adicionando os dias da semana
		diaSemana.add("Segunda-feira");
		diaSemana.add("Terça-feira");
		diaSemana.add("Quarta-feira");
		diaSemana.add("Quinta-feira");
		diaSemana.add("Sexta-feira");
		diaSemana.add("Sábado");
		diaSemana.add("Domingo");
		//
		while(true) {
			//
			int operador = 0;
			System.out.println("0 - Segunda-feira \n1 - Terça-feira\n2 - Quarta-feira\n3 - Quinta-feira\n4 - Sexta-feira\n5 - Sábado\n6 - Domingo");
			System.out.println("\nDigite o dia da semana: ");
			operador = scn.nextInt();
			//
			switch (operador) {
			case 0:
				System.out.println("Selecionou a " + diaSemana.get(operador));
				break;
			case 1:
				System.out.println("Selecionou a " + diaSemana.get(operador));
				break;
			case 2:
				System.out.println("Selecionou a " + diaSemana.get(operador));
				break;
			case 3:
				System.out.println("Selecionou a " + diaSemana.get(operador));
				break;
			case 4:
				System.out.println("Selecionou a " + diaSemana.get(operador));
				break;
			case 5:
				System.out.println("Selecionou a " + diaSemana.get(operador));
				break;
			case 6:
				System.out.println("Selecionou a " + diaSemana.get(operador));
				break;
			default:
				System.out.println("Valor digitado inválido.");
				break;
			}
		}
	}
}
