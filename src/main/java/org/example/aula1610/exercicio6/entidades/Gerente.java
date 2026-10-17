package org.example.aula1610.exercicio6.entidades;

public class Gerente extends Funcionario{

    private double salario;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salario = getSalarioBase() + (getSalarioBase() * 0.50);
    }

    public double getSalario() {
        return this.salario;
    }
}
