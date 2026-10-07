package org.example.aula0710.listarevisao;

import java.util.Locale;
import java.util.Scanner;

public class ScannerAtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // 1 - Pergunte o nome da pessoa e responda: "OlÃ¡, [nome]!"
        System.out.println("Ex1 - SaudaÃ§Ã£o com nome");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("OlÃ¡, " + nome + "!");
        System.out.println();

        // 2 - Pergunte a idade e responda quantos anos ela vai fazer no prÃ³ximo aniversÃ¡rio.
        System.out.println("Ex2 - PrÃ³ximo aniversÃ¡rio");
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("No prÃ³ximo aniversÃ¡rio vocÃª vai fazer " + (idade + 1) + " anos.");
        System.out.println();

        // 3 - Pergunte dois nÃºmeros e mostre a soma.
        System.out.println("Ex3 - Soma de dois nÃºmeros");
        System.out.print("Digite o primeiro nÃºmero: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo nÃºmero: ");
        int numero2 = sc.nextInt();
        sc.nextLine();
        System.out.println("A soma Ã©: " + (numero1 + numero2));
        System.out.println();

        // 4 - Pergunte a altura e o peso e imprima os dois numa frase.
        System.out.println("Ex4 - Altura e peso");
        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu peso (ex: 70.5): ");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("A altura Ã© " + altura + " e o peso Ã© " + peso + ".");
        System.out.println();

        // Mini-desafio - FaÃ§a um programa que peÃ§a, nesta ordem: a idade (nÃºmero), o nome (texto) e a cidade (texto).
        // Depois imprima tudo numa ficha.
        // Dica: quando vocÃª digita um nÃºmero e aperta Enter, o nextInt() pega o nÃºmero e deixa o Enter para trÃ¡s.
        // O nextLine() seguinte encontra esse Enter e acha que vocÃª nÃ£o digitou nada.
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
