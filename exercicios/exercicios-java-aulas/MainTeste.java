package com.estudos.classesObjetos;

public class MainTeste {
    public static void main(String[] args) {
        ClasseJava novoObjeto = new ClasseJava();
        novoObjeto.setClasseJava("Abraão", 22, "Rua da Diversão, 90");
        System.out.println(novoObjeto.toString());

        // E se eu quiser acessar as variáveis de instância de uma classe. É possível
        // novoObjeto.nome = "Abraão"; (ERRO)
        novoObjeto.numeroTelefone = 11983263585L;
        System.out.println("Número de telefone é: " + novoObjeto.numeroTelefone);

    }
}
