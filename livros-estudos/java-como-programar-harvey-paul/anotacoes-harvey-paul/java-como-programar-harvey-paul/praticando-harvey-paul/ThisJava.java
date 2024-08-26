package com.estudos.classesObjetos;

public class ThisJava {
    /* O this faz referência as variáveis de instância, isto é, referênciando a si mesma.
     * */
    private String nome;
    private String descricao;

    // Construtor
    public ThisJava(String _nome, String _descricao){
        this.nome = _nome;
        this.descricao = _descricao;
    }

    public static void main(String[] args) {
        ThisJava obj = new ThisJava("Abraão", "Nova mensagem enviada!");
    }
}
