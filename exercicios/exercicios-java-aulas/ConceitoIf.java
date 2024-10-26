package exercicios.fatec;
import java.util.Scanner;

public class ConceitoIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int valorUm = scn.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valorDois = scn.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int valorTres = scn.nextInt();
		// V1
		if (valorUm >= valorDois && valorUm >= valorTres) {
			if (valorDois >= valorTres) {
				System.out.printf("[%d, %d, %d]", valorUm, valorDois, valorTres);
			} else {
				System.out.printf("[%d, %d, %d]", valorUm, valorTres, valorDois);
			}
			// V2
		} else if (valorDois >= valorUm && valorDois >= valorTres) {
			if (valorUm >= valorTres) {
				System.out.printf("[%d, %d, %d]", valorDois, valorUm, valorTres);
			} else {
				System.out.printf("[%d, %d, %d]", valorDois, valorTres, valorUm);
			}
			// V3
		} else {
			if (valorDois > valorUm) {
				System.out.printf("[%d, %d, %d]", valorTres, valorDois, valorUm);
			} else {
				System.out.printf("[%d, %d, %d]", valorTres, valorUm, valorDois);
			}
		}
		
	}
}
