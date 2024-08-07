package com.estudos.metodos;

public class MetodoStatic {
    public static String helloWorld() {
        return "Hello World";
    } // Método da classe que retorna uma string 'Hello World!'

    public static void yourName(String name) {
        System.out.printf("Seu nome é %s\n", name);
    }

    public static void main(String[] args) {
        // Execução
        System.out.println(MetodoStatic.helloWorld());
        MetodoStatic.yourName("Abraão Santos");

        // Os métodos da classe Math são statics (todos), ou seja:
        // Aliás, inserir um 'final' implica que a variável 'raizQuadrada25' seja constante durante toda execução
        final double raizQuadrada25 = Math.sqrt(25.0);
        System.out.println("Resultado da raiz de 25: " + raizQuadrada25);
        // Mais um pouco sobre raiz
        double A = 25.0;
        double B = 25.0;
        final double AxB = (A * B);
        System.out.printf("Resultado de %f vezes %f é = %f\n", A, B, AxB);
        final double raizQuadradaAxB = Math.sqrt(AxB);
        System.out.printf("Raiz de %f é = %f\n", AxB, raizQuadradaAxB);
        // Potência
        // Os parâmetros que recebem são do tipo double
        System.out.println(Math.pow(5.0, 5.0));
    }
}
