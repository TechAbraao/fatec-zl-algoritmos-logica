package exercicios.fatec;
import java.util.Scanner;

public class ImprimirMensagem {
	public static void printMessage(String message) {
		System.out.printf("Mensagem recebida: %s", message);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite uma mensagem: ");
		String msg = scn.nextLine();
		//
		ImprimirMensagem.printMessage(msg);
		
	}
}
