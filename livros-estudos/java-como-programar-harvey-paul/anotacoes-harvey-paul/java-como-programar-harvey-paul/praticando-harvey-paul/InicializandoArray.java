package aulafatec;

public class InicializandoArray {
	public static void main(String[] args) {
		int[] inicia_array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int e = 0; e < inicia_array.length; e++) {
			int index = inicia_array[e];
			System.out.printf("Índice: %d - Elemento: %d\n", e, index);
		}
	}
}
