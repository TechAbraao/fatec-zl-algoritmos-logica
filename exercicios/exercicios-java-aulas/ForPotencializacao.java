package exercicios.fatec;

public class ForPotencializacao {
	
	public static int pow(int base, int expoent) {
		int powResult = 1;
		for (int i = 0; i < expoent; powResult++) {
			powResult = base * expoent;
		}
		return powResult;
	}
	
	public static void main(String[] args) {
		double potResult;
		int base = 3, expoent = 0;
		for (int i = 0; i <= 15; i++) {
			potResult = Math.pow(base, expoent);
			System.out.printf("3 elevado a %d = %.0f%n", i, potResult);
			expoent++;
		}
	}
}
