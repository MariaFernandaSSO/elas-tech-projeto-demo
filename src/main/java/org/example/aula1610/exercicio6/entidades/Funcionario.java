package org.example.aula1610.exercicio6.entidades;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            System.out.println("Números negativos não são permitidos!!! >:c");
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public abstract double calcularSalario();
}
