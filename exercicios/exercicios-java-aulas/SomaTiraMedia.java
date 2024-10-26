package aulafatec;

public class SomaTiraMedia {
	public static void main(String[] args) {
		int[] numeros = new int[5];
		numeros[0] = 100;
		numeros[1] = 200;
		numeros[2] = 300;
		numeros[3] = 400;
		numeros[4] = 500;
		
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		float media = soma / numeros.length;
		System.out.println("Média: " + media);
				
	}
}
