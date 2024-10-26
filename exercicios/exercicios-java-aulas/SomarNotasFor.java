package exercicios.fatec;
import java.util.Scanner;

public class SomarNotasFor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Double sum = Double.valueOf(0);
		
		System.out.println("Digite a quantidade de notas: ");
		int MAXREPEAT = scn.nextInt();
		for (int i = 1; i <= MAXREPEAT; i++) {
			//
			System.out.printf("Digite a %dx nota: ", i);
			Double n = scn.nextDouble();
			sum += n;
		}
		System.out.println("Soma das notas: " + sum);
		System.out.println("Média das notas: "+ (sum / MAXREPEAT));
	}
}
