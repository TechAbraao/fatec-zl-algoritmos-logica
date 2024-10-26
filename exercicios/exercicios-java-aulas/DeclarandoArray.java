package com.estudos.arrays;

public class DeclarandoArray {
    //
    public static void main(String[] args) {
        // 'primeiroArray' referencia um array
        int[] arrayInt = new int[12]; // Criou um array que contém doze elementos
        System.out.printf("Array Int: %d\n", arrayInt[2]);
        // Todos os espaços de memória dos elementos são inicializados, porém, todos inicializam como zero.
        String[] arrayString = new String[20];
        System.out.printf("Array String: %s\n", arrayString[15]);
        // Vamos acessar o index do array e seu elemento pela instrução 'for'
        for (int c = 0; c < arrayInt.length; c++){
            System.out.printf("Index: %d - Elemento: %d\n", c, arrayInt[c]);
        }
    }
}
