package org.example.aula2909.strings;

import java.util.Scanner;

public class StringAtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        System.out.println("--- Exercício 1 ---");
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println("Quantidade de caracteres (com espaços): " + nomeCompleto.length());
        System.out.println();

        // 2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
        System.out.println("--- Exercício 2 ---");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Maiúsculo: " + nome.toUpperCase());
        System.out.println("Minúsculo: " + nome.toLowerCase());
        System.out.println();

        // 3 — Peça o nome da pessoa e mostre a primeira letra dele.
        System.out.println("--- Exercício 3 ---");
        System.out.print("Digite seu nome: ");
        String nomePrimeiraLetra = sc.nextLine();


        if (!nomePrimeiraLetra.isEmpty()) {
            System.out.println("A primeira letra é: " + nomePrimeiraLetra.charAt(0));
        } else {
            System.out.println("Nenhum nome foi digitado.");
        }
        System.out.println();

        // 4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        System.out.println("--- Exercício 4 ---");
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean contemPalavra = frase.contains(palavra);
        System.out.println("A palavra aparece na frase? " + contemPalavra);
        System.out.println();

        // 5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        System.out.println("--- Exercício 5 ---");
        System.out.print("Digite seu nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite de novo: ");
        String nome2 = sc.nextLine();

        boolean nomesIguais = nome1.equalsIgnoreCase(nome2);
        System.out.println("Os nomes são iguais? " + nomesIguais);

        sc.close();
    }
}