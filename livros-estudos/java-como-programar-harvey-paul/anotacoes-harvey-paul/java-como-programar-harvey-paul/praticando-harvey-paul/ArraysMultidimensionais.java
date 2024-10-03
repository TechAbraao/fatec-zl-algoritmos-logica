package aulafatec;

public class ArraysMultidimensionais {
	public static void main(String[] args) {
						//	  0  1    0  1 
		int [][] matrix_1 = {{2, 3}, {4, 5}};
		int[][] matrix_2 = new int[2][3];
		//
		matrix_2[0][0] = 22;
		System.out.printf("Linha 1 - Coluna 1 - Valor: %d\n", matrix_2[0][0]);
		System.out.println(matrix_1[1][1]);
		
		int[][] matrix_3 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		// int[2][4] - 2 linhas e 4 colunas
		System.out.println(matrix_3[1][1]);
		//
	}
}
