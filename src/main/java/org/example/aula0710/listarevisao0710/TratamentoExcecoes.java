package org.example.aula0710.listarevisao0710;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.
        System.out.println("Ex1 - Divisão com tratamento de divisão por zero");
        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int numero2 = sc.nextInt();
            sc.nextLine();

            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
            sc.nextLine();
        }
        System.out.println();

        // 2 - Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.
        System.out.println("Ex2 - Nota em posição inválida do array");
        double[] notas = {8.0, 6.5, 9.0, 7.5, 10.0};
        try {
            System.out.print("Digite uma posição (0 a 4): ");
            int posicao = sc.nextInt();
            sc.nextLine();

            System.out.println("Nota na posição " + posicao + ": " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida. O array vai de 0 a 4.");
            sc.nextLine();
        }
        System.out.println();

        // 3 - Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.
        System.out.println("Ex3 - Idade com nextInt() e texto no lugar de número");
        try {
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Idade digitada: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");
            sc.nextLine();
        }
        System.out.println();

        // 4 - Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.
        System.out.println("Ex4 - NullPointerException em nome null");
        String nome = null;
        try {
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: o nome não foi preenchido.");
        }
        System.out.println();

        // 5 - Crie um array com 3 nomes e tente imprimir a posição 5.
        // Trate a exceção e, depois do try/catch, imprima "O programa continua funcionando."
        System.out.println("Ex5 - Array com posição 5 e continuidade do programa");
        String[] nomes = {"Ana", "Bruno", "Carla"};
        try {
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: a posição 5 não existe neste array.");
        }
        System.out.println("O programa continua funcionando.");
        System.out.println();

        // Mini-desafio - Faça um programa com um try e três catch diferentes:
        // um para divisão por zero, um para posição inválida de array e um genérico (Exception) no final.
        // Teste cada situação e veja qual catch é acionado.
        // Dica: o catch (Exception e) pega qualquer erro, então ele precisa ser o último.
        // Se vier antes dos outros, o código nem compila — os de baixo nunca seriam alcançados.
        System.out.println("Mini-desafio - Um try com três catch");
        try {
            System.out.print("Digite um número para dividir 100: ");
            int divisor = sc.nextInt();
            System.out.print("Digite uma posição no array de notas: ");
            int pos = sc.nextInt();
            sc.nextLine();

            int resultadoDivisao = 100 / divisor;
            System.out.println("100 / " + divisor + " = " + resultadoDivisao);

            System.out.println("Nota na posição " + pos + ": " + notas[pos]);

            String texto = null;
            System.out.println(texto.length());
        } catch (ArithmeticException e) {
            System.out.println("Catch: ArithmeticException (divisão por zero).");
            sc.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch: ArrayIndexOutOfBoundsException (posição inválida).");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Catch: Exception (erro genérico).");
            System.out.println("Detalhe: " + e);
            sc.nextLine();
        }

        sc.close();
    }
}
