package org.example.aula0710.listarevisao0710;

import java.util.Locale;
import java.util.Scanner;

public class ScannerAtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // 1 - Pergunte o nome da pessoa e responda: "Olá, [nome]!"
        System.out.println("Ex1 - Saudação com nome");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");
        System.out.println();

        // 2 - Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.
        System.out.println("Ex2 - Próximo aniversário");
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("No próximo aniversário você vai fazer " + (idade + 1) + " anos.");
        System.out.println();

        // 3 - Pergunte dois números e mostre a soma.
        System.out.println("Ex3 - Soma de dois números");
        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        sc.nextLine();
        System.out.println("A soma é: " + (numero1 + numero2));
        System.out.println();

        // 4 - Pergunte a altura e o peso e imprima os dois numa frase.
        System.out.println("Ex4 - Altura e peso");
        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu peso (ex: 70.5): ");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("A altura é " + altura + " e o peso é " + peso + ".");
        System.out.println();

        // Mini-desafio - Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto).
        // Depois imprima tudo numa ficha.
        // Dica: quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás.
        // O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.
        // Por isso, depois do nextInt(), use sc.nextLine() para limpar o buffer.
        System.out.println("Mini-desafio - Ficha com idade, nome e cidade");
        System.out.print("Digite a idade: ");
        int idadeFicha = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome: ");
        String nomeFicha = sc.nextLine();
        System.out.print("Digite a cidade: ");
        String cidadeFicha = sc.nextLine();

        System.out.println("--- FICHA ---");
        System.out.println("Idade: " + idadeFicha);
        System.out.println("Nome: " + nomeFicha);
        System.out.println("Cidade: " + cidadeFicha);

        sc.close();
    }
}
