package aulafatec;

public class TabelaArrayMultidimensional {
	public static void main(String[] args) {
		String [][] PESSOA = new String[2][3];
		PESSOA[0][0] = "Nome";
		PESSOA[0][1] = "Sobrenome";
		PESSOA[0][2] = "Idade";
		//
		PESSOA[1][0] = "Abraão";
		PESSOA[1][1] = "Santos";
		PESSOA[1][2] = "22";
		//
		for (int i = 0; i < PESSOA.length; i++) {
			for (int j = 0; j < PESSOA[0].length; j++) {
				System.out.print(PESSOA[i][j] + " ");
			}
			System.out.println();
		}
	}
}
