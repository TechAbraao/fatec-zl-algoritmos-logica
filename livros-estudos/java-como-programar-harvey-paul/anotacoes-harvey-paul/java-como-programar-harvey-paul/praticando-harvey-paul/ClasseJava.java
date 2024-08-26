package com.estudos.classesObjetos;

public class ClasseJava {
    // Variáveis de instância são privadas
    private String nome;
    private int idade;
    private String endereco;
    public long numeroTelefone;
    //
    public void setClasseJava(String _nome, int _idade, String _endereco) {
        this.nome = _nome;
        this.idade = _idade;
        this.endereco = _endereco;
    }
    @Override
    public String toString() {
        return "ClasseJava{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }

}
