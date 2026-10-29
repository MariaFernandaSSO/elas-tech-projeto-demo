package org.example.aula2810;

public class Exercicio2 {
    public static void main(String[] args) {

        // 2 - Interface Impressora com void imprimir(String texto).
        // Crie duas variaveis diferentes desse tipo usando duas lambdas: uma que imprime o texto
        // em maiusculo, outra que imprime em minusculo. Chame as duas.
        Impressora maiusculo = texto -> System.out.println(texto.toUpperCase());
        Impressora minusculo = texto -> System.out.println(texto.toLowerCase());

        maiusculo.imprimir("Olá, mundo!");
        minusculo.imprimir("OLÁ, MUNDO!");
    }
}
