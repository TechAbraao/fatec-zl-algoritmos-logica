package com.exercicios.fatec;
import java.util.Scanner;

public class EternalyLoop {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			String nomeSelecionado = "";
			nomeSelecionado = scn.nextLine();
			if (nomeSelecionado.equals("Abraão")) {
				System.out.println("Nome correto!");
			} else {
				System.out.println("Nome errado!");
			}
		}
	}
}
