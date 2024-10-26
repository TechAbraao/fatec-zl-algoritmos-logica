package com.exercicios.fatec;
import java.util.Scanner;

public class WhileSimNao {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] resp = {"Sim", "Não"};
		
		String dec = scn.nextLine();
		//
		if (dec.equalsIgnoreCase(resp[0])) {
			System.out.printf("Você selecionou: %s%n", resp[0]);
			//
			String nome = "", sobrenome = "";
			int count = 1;
			while (count <= 1) {
				System.out.println("Digite seu nome: ");
				nome = scn.nextLine();
				System.out.println("Digie seu sobrenome: ");
				sobrenome = scn.nextLine();
				count++;
			}
			System.out.printf("Seu nome completo é: %s %s", nome, sobrenome);
		}
		else {
			System.out.printf("Você selecionou: %s%nPrograma encerrado!", resp[1]);
		}
		
	}
}
