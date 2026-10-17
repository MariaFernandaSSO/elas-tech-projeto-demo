package org.example.aula1610.exercicio6.entidades;

public class Desenvolvedor extends Funcionario{

    private double salario;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override // Sobreescrever
    public double calcularSalario() {
        return salario = getSalarioBase() + (getSalarioBase() * 0.20);
    }

    public double getSalario() {
        return this.salario;
    }
}
