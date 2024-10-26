package com.estudos.metodos;

public class VariaveisStatic {
    // Apenas uma breve introdução por pura curiosidade
    private static final int number = 2002; // Apenas uma cópia para toda classe
    private String name;

    public VariaveisStatic(String _name) {
        this.name = _name;
    }
    // Retornar o campo static
    public int getNumber() {
        return number;
    }
    public static void main(String[] args) {
        //
        VariaveisStatic objeto1 = new VariaveisStatic("Abraão");
        VariaveisStatic objeto2 = new VariaveisStatic("César");
        // Cada instância não é sua própria cópia, afinal, é uma cópia única
        System.out.println("objeto1 = " + objeto1.getNumber());
        System.out.println("objeto2 = " + objeto2.getNumber());
    }
}
