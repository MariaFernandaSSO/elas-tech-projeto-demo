package org.example.aula0710.listarevisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - PeÃ§a dois nÃºmeros e mostre a divisÃ£o. Trate o caso de a pessoa digitar 0 no segundo.
        System.out.println("Ex1 - DivisÃ£o com tratamento de divisÃ£o por zero");
        try {
            System.out.print("Digite o primeiro nÃºmero: ");
            int numero1 = sc.nextInt();
            System.out.print("Digite o segundo nÃºmero: ");
            int numero2 = sc.nextInt();
            sc.nextLine();

            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisÃ£o: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: nÃ£o Ã© possÃ­vel dividir por zero.");
            sc.nextLine();
        }
        System.out.println();

        // 2 - Crie um array com 5 notas. PeÃ§a uma posiÃ§Ã£o e mostre a nota. Trate posiÃ§Ã£o invÃ¡lida.
        System.out.println("Ex2 - Nota em posiÃ§Ã£o invÃ¡lida do array");
        double[] notas = {8.0, 6.5, 9.0, 7.5, 10.0};
        try {
            System.out.print("Digite uma posiÃ§Ã£o (0 a 4): ");
            int posicao = sc.nextInt();
            sc.nextLine();

            System.out.println("Nota na posiÃ§Ã£o " + posicao + ": " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posiÃ§Ã£o invÃ¡lida. O array vai de 0 a 4.");
            sc.nextLine();
        }
        System.out.println();

        // 3 - PeÃ§a a idade com nextInt(). Trate o caso de a pessoa digitar texto.
        System.out.println("Ex3 - Idade com nextInt() e texto no lugar de nÃºmero");
        try {
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Idade digitada: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas nÃºmeros inteiros.");
            sc.nextLine();
        }
        System.out.println();

        // 4 - Crie String nome = null; e tente imprimir nome.length(). Trate a exceÃ§Ã£o.
        System.out.println("Ex4 - NullPointerException em nome null");
        String nome = null;
        try {
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: o nome nÃ£o foi preenchido.");
        }
        System.out.println();

        // 5 - Crie um array com 3 nomes e tente imprimir a posiÃ§Ã£o 5.
        // Trate a exceÃ§Ã£o e, depois do try/catch, imprima "O programa continua funcionando."
        System.out.println("Ex5 - Array com posiÃ§Ã£o 5 e continuidade do programa");
        String[] nomes = {"Ana", "Bruno", "Carla"};
        try {
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: a posiÃ§Ã£o 5 nÃ£o existe neste array.");
        }
        System.out.println("O programa continua funcionando.");
        System.out.println();

        // Mini-desafio - FaÃ§a um programa com um try e trÃªs catch diferentes:
        // um para divisÃ£o por zero, um para posiÃ§Ã£o invÃ¡lida de array e um genÃ©rico (Exception) no final.
        // Teste cada situaÃ§Ã£o e veja qual catch Ã© acionado.
        // Dica: o catch (Exception e) pega qualquer erro, entÃ£o ele precisa ser o Ãºltimo.
        // Se vier antes dos outros, o cÃ³digo nem compila â€” os de baixo nunca seriam alcanÃ§ados.
        System.out.println("Mini-desafio - Um try com trÃªs catch");
        try {
            System.out.print("Digite um nÃºmero para dividir 100: ");
            int divisor = sc.nextInt();
            System.out.print("Digite uma posiÃ§Ã£o no array de notas: ");
            int pos = sc.nextInt();
            sc.nextLine();

            int resultadoDivisao = 100 / divisor;
            System.out.println("100 / " + divisor + " = " + resultadoDivisao);

            System.out.println("Nota na posiÃ§Ã£o " + pos + ": " + notas[pos]);

            String texto = null;
            System.out.println(texto.length());
        } catch (ArithmeticException e) {
            System.out.println("Catch: ArithmeticException (divisÃ£o por zero).");
            sc.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch: ArrayIndexOutOfBoundsException (posiÃ§Ã£o invÃ¡lida).");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Catch: Exception (erro genÃ©rico).");
            System.out.println("Detalhe: " + e);
            sc.nextLine();
        }

        sc.close();
    }
}
