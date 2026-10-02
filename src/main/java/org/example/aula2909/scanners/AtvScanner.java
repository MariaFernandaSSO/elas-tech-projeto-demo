package org.example.aula2909.scanners;

import java.util.Scanner;

public class AtvScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Peça o nome da pessoa e a idade dela.
        System.out.println("Ex1 - Peça o nome da pessoa e a idade dela.");
        System.out.print("Qual seu nome? ");
        String nomePessoa = sc.nextLine();
        System.out.print("Qual sua idade? ");
        int idade = sc.nextInt();

        System.out.printf("Oi %s, você tem %d anos e vai fazer %d no próximo aniversário.!\n\n", nomePessoa, idade, (idade + 1));
        sc.nextLine();

        // 2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.
        System.out.println("Ex2 - Operações Matemáticas");
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + ((double) num1 / num2));
        System.out.println("Resto: " + (num1 % num2));
        System.out.println();

        // 3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.
        System.out.println("Ex3 - Status da Aluna");
        System.out.print("Digite a nota da aluna: ");
        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovada!");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovada!");
        }
        System.out.println();

        // 4 - Peça um número e mostre a tabuada dele de 1 a 10.
        System.out.println("Ex4 - Tabuada");
        System.out.print("Digite um número para ver a tabuada: ");
        int numeroTabuada = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numeroTabuada, i, (numeroTabuada * i));
        }

        sc.close();
    }
}
