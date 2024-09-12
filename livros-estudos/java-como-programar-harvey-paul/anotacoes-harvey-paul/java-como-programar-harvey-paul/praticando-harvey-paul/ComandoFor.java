package exercicios.fatec;
import java.util.Scanner;

public class ComandoFor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Escreva seu nome: ");
		String name = scn.nextLine();
		System.out.println("Quantidade que deseja repetir: ");
		int MAXREPEAT = scn.nextInt();
		//
		for (int i = 1; i <= MAXREPEAT; i++) {
			System.out.printf("Repetiu %dx o nome %s%n", i, name);
		}
	}
}
