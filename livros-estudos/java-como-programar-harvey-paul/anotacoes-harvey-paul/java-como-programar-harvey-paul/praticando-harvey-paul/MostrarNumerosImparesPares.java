package exercicios.fatec;

public class MostrarNumerosImparesPares {
	public static void main(String[] args) {
		//
		for (int i = 0; i <= 20; i++) {
			if ((i % 2) == 0) {
				System.out.println("Número par: " + (i));
			} else {
				System.out.println("Número ímpar: " + (i));
			}
		}
	}
}
