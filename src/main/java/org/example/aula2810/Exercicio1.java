package org.example.aula2810;

public class Exercicio1 {
    public static void main(String[] args) {

        // 1 - Crie uma interface Saudacao com um metodo void executar().
        // Depois, em uma classe com main, crie uma variavel desse tipo usando lambda e chame o metodo.
        // O corpo da lambda deve imprimir "oi".
        Saudacao saudacao = () -> System.out.println("oi");

        saudacao.executar();
    }
}
