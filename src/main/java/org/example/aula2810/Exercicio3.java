package org.example.aula2810;

public class Exercicio3 {
    public static void main(String[] args) {

        // 3 - Interface Calculo com int calcular(int a, int b).
        // Crie tres lambdas: soma, multiplicacao e a que retorna o maior dos dois.
        // Chame as tres e imprima os resultados.
        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maior = (a, b) -> a > b ? a : b;

        System.out.println("Soma: " + soma.calcular(5, 3));
        System.out.println("Multiplicação: " + multiplicacao.calcular(5, 3));
        System.out.println("Maior: " + maior.calcular(5, 3));
    }
}
