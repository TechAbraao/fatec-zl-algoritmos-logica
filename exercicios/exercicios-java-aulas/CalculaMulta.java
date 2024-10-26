package exercicios.fatec;
import java.util.Scanner;

public class CalculaMulta {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a velocidade do carro: ");
        double velocidadeCarro = scn.nextDouble();
        System.out.println("Digite a velocidade máxima da rua: ");
        double velocidadeMax = scn.nextDouble();
        
        double deltaVariacao = velocidadeCarro - velocidadeMax;
        
        if (deltaVariacao <= 0) {
            System.out.println("Não há multa. O carro está dentro da velocidade permitida.");
        } else if (deltaVariacao <= 10) {
            System.out.println("Multa de R$ 50,00");
        } else if (deltaVariacao <= 30) {
            System.out.println("Multa de R$ 100,00");
        } else {
            System.out.println("Multa de R$ 300,00");
        }
        
    }
}