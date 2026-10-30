package org.example.aula3010.lambda2;

import java.util.function.Consumer;

public class Exercicio2 {

    public static void main(String[] args) {
        Consumer<String> saudacao = nome -> System.out.println("Olá, " + nome);
        Consumer<String> maiusculo = nome -> System.out.println(nome.toUpperCase());

        saudacao.accept("Flora");
        maiusculo.accept("Flora");
    }
}
