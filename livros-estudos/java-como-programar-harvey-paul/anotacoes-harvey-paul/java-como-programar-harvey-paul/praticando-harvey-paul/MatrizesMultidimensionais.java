package aula;

public class MatrizesMultidimensionais {
	public static void main(String[] args) {
						// 2 linhas e 3 colunas
		// voce define as linhas e as colunas
		int matriz [][] = new int[2][3];
		int nova_matriz[][] = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
		int new_matriz [][] = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
		int soma [][] = new int[4][4];
		
		// percorrendo 
		for (int i = 0; i < nova_matriz.length; i++) {
			for (int j = 0; j < nova_matriz.length; j++) {
				soma[i][j] = nova_matriz[i][j] + new_matriz[i][j];
				System.out.print(soma[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
