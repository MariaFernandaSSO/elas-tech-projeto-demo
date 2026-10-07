package org.example.aula0710.listarevisao0710;

import java.util.Locale;
import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // 1 - Peça a idade e diga se a pessoa é maior ou menor de idade.
        System.out.println("Ex1 - Maior ou menor de idade");
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        System.out.println();

        // 2 - Peça um número e diga se ele é par ou ímpar.
        System.out.println("Ex2 - Par ou ímpar");
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.nextLine();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        System.out.println();

        // 3 - Peça dois números e diga qual é o maior. Se forem iguais, avise.
        System.out.println("Ex3 - Maior número");
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        if (n1 > n2) {
            System.out.println("O maior número é " + n1 + ".");
        } else if (n2 > n1) {
            System.out.println("O maior número é " + n2 + ".");
        } else {
            System.out.println("Os dois números são iguais.");
        }
        System.out.println();

        // 4 - Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".
        System.out.println("Ex4 - Situação da nota");
        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();
        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
        System.out.println();

        // 5 - Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.
        System.out.println("Ex5 - Sabor de sorvete com switch");
        System.out.print("Digite um número de 1 a 3: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                System.out.println("Sabor: Chocolate");
                break;
            case 2:
                System.out.println("Sabor: Morango");
                break;
            case 3:
                System.out.println("Sabor: Baunilha");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println();

        // 6 - Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.
        System.out.println("Ex6 - Valor do ingresso");
        System.out.print("Digite a idade: ");
        int idadeIngresso = sc.nextInt();
        sc.nextLine();
        if (idadeIngresso < 12 || idadeIngresso >= 60) {
            System.out.println("Valor do ingresso: R$ 10");
        } else {
            System.out.println("Valor do ingresso: R$ 25");
        }
        System.out.println();

        // Mini-desafio - Peça os três lados de um triângulo e classifique:
        // todos iguais -> Equilátero; dois iguais -> Isósceles; todos diferentes -> Escaleno.
        // Dica: a ordem dos testes importa. Um triângulo equilátero também tem dois lados iguais,
        // então o teste do isósceles não pode vir antes do equilátero.
        System.out.println("Mini-desafio - Classificação de triângulo");
        System.out.print("Digite o lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        double ladoC = sc.nextDouble();
        sc.nextLine();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triângulo Equilátero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

        sc.close();
    }
}
