package aulafatec;
import java.util.Scanner;

public class VetoresArrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] lista_nomes = new String[5];
		//
		for (int index = 1; index <= lista_nomes.length; index++) {
			System.out.printf("Adicione o %dx nome na lista!\n", index);
			String nome_add = scn.nextLine();
			lista_nomes[1 - 1] = nome_add;
			System.out.printf("Nome: %s adicionado com sucesso.\n", nome_add);
		}
		System.out.println("Lista de nomes = " + lista_nomes);
		//
	}
}
