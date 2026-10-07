package org.example.aula0710.listarevisao0710;

import java.util.Scanner;

public class StringsAtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Peça o nome completo e mostre quantas letras ele tem.
        System.out.println("Ex1 - Quantidade de letras do nome completo");
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println("O nome completo tem " + nomeCompleto.length() + " letras (com espaços).");
        System.out.println();

        // 2 - Peça o nome e mostre em MAIÚSCULO e em minúsculo.
        System.out.println("Ex2 - Nome em maiúsculo e minúsculo");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Maiúsculo: " + nome.toUpperCase());
        System.out.println("Minúsculo: " + nome.toLowerCase());
        System.out.println();

        // 3 - Peça o nome e mostre a primeira letra.
        System.out.println("Ex3 - Primeira letra do nome");
        System.out.print("Digite seu nome: ");
        String nome2 = sc.nextLine();
        if (!nome2.isEmpty()) {
            System.out.println("Primeira letra: " + nome2.charAt(0));
        } else {
            System.out.println("Nenhum nome foi digitado.");
        }
        System.out.println();

        // 4 - Peça uma frase e uma palavra. Diga se a palavra aparece na frase.
        System.out.println("Ex4 - Palavra na frase");
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
        System.out.println();

        // 5 - Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.
        System.out.println("Ex5 - Comparar nomes ignorando maiúsculas");
        System.out.print("Digite seu nome: ");
        String nomeA = sc.nextLine();
        System.out.print("Digite o nome de novo: ");
        String nomeB = sc.nextLine();
        System.out.println("Os nomes são iguais? " + nomeA.equalsIgnoreCase(nomeB));
        System.out.println();

        // 6 - Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).
        System.out.println("Ex6 - Nome em maiúsculo e sem espaços nas pontas");
        System.out.print("Digite seu nome: ");
        String nome3 = sc.nextLine();
        System.out.println(nome3.trim().toUpperCase());
        System.out.println();

        // Mini-desafio - Peça uma palavra e diga se ela começa e termina com a mesma letra,
        // ignorando maiúscula e minúscula. Exemplos: ana -> sim · Ovo -> sim · casa -> não
        // Dica: a primeira letra está na posição 0. A última está na posição length() - 1.
        // E pra ignorar maiúscula, converta a palavra inteira antes de comparar.
        System.out.println("Mini-desafio - Mesma letra no início e no fim");
        System.out.print("Digite uma palavra: ");
        String palavraMini = sc.nextLine().toLowerCase();

        if (palavraMini.length() > 0
                && palavraMini.charAt(0) == palavraMini.charAt(palavraMini.length() - 1)) {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        sc.close();
    }
}
