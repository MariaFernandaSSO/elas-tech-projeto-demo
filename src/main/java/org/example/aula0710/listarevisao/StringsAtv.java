package org.example.aula0710.listarevisao;

import java.util.Scanner;

public class StringsAtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - PeÃ§a o nome completo e mostre quantas letras ele tem.
        System.out.println("Ex1 - Quantidade de letras do nome completo");
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println("O nome completo tem " + nomeCompleto.length() + " letras (com espaÃ§os).");
        System.out.println();

        // 2 - PeÃ§a o nome e mostre em MAIÃšSCULO e em minÃºsculo.
        System.out.println("Ex2 - Nome em maiÃºsculo e minÃºsculo");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("MaiÃºsculo: " + nome.toUpperCase());
        System.out.println("MinÃºsculo: " + nome.toLowerCase());
        System.out.println();

        // 3 - PeÃ§a o nome e mostre a primeira letra.
        System.out.println("Ex3 - Primeira letra do nome");
        System.out.print("Digite seu nome: ");
        String nome2 = sc.nextLine();
        if (!nome2.isEmpty()) {
            System.out.println("Primeira letra: " + nome2.charAt(0));
        } else {
            System.out.println("Nenhum nome foi digitado.");
        }
        System.out.println();

        // 4 - PeÃ§a uma frase e uma palavra. Diga se a palavra aparece na frase.
        System.out.println("Ex4 - Palavra na frase");
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
        System.out.println();

        // 5 - PeÃ§a o nome duas vezes e diga se os dois sÃ£o iguais, ignorando maiÃºsculas.
        System.out.println("Ex5 - Comparar nomes ignorando maiÃºsculas");
        System.out.print("Digite seu nome: ");
        String nomeA = sc.nextLine();
        System.out.print("Digite o nome de novo: ");
        String nomeB = sc.nextLine();
        System.out.println("Os nomes sÃ£o iguais? " + nomeA.equalsIgnoreCase(nomeB));
        System.out.println();

        // 6 - PeÃ§a um nome e mostre em maiÃºsculo, sem espaÃ§os nas pontas (dois mÃ©todos encadeados).
        System.out.println("Ex6 - Nome em maiÃºsculo e sem espaÃ§os nas pontas");
        System.out.print("Digite seu nome: ");
        String nome3 = sc.nextLine();
        System.out.println(nome3.trim().toUpperCase());
        System.out.println();

        // Mini-desafio - PeÃ§a uma palavra e diga se ela comeÃ§a e termina com a mesma letra,
        // ignorando maiÃºscula e minÃºscula. Exemplos: ana -> sim Â· Ovo -> sim Â· casa -> nÃ£o
        // Dica: a primeira letra estÃ¡ na posiÃ§Ã£o 0. A Ãºltima estÃ¡ na posiÃ§Ã£o length() - 1.
        // E pra ignorar maiÃºscula, converta a palavra inteira antes de comparar.
        System.out.println("Mini-desafio - Mesma letra no inÃ­cio e no fim");
        System.out.print("Digite uma palavra: ");
        String palavraMini = sc.nextLine().toLowerCase();

        if (palavraMini.length() > 0
                && palavraMini.charAt(0) == palavraMini.charAt(palavraMini.length() - 1)) {
            System.out.println("sim");
        } else {
            System.out.println("nÃ£o");
        }

        sc.close();
    }
}
