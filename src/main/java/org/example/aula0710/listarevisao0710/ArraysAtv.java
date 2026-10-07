package org.example.aula0710.listarevisao0710;

import java.util.Scanner;

public class ArraysAtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.
        System.out.println("Ex1 - Primeiro, terceiro e último nome");
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};
        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Terceiro: " + nomes[2]);
        System.out.println("Último: " + nomes[nomes.length - 1]);
        System.out.println();

        // 2 - Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.
        System.out.println("Ex2 - Notas com laço");
        int[] notas = {8, 6, 10, 7, 9};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println();

        // 3 - Com o mesmo array, calcule e imprima a soma e a média.
        System.out.println("Ex3 - Soma e média das notas");
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println();

        // 4 - Crie um array com 5 números e descubra qual é o maior.
        System.out.println("Ex4 - Maior número do array");
        int[] numeros = {12, 45, 7, 89, 33};
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println();

        // 5 - Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.
        System.out.println("Ex5 - Notas maiores ou iguais a 7");
        int[] notas2 = {8, 5, 10, 4, 7};
        int contador = 0;
        for (int i = 0; i < notas2.length; i++) {
            if (notas2[i] >= 7) {
                contador++;
            }
        }
        System.out.println("Quantidade de notas >= 7: " + contador);
        System.out.println();

        // Mini-desafio - Crie um array com 5 nomes. Peça um nome pra pessoa e diga em qual posição ele está.
        // Se não estiver na lista, avise.
        // Dica: crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei".
        // Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.
        System.out.println("Mini-desafio - Buscar nome no array");
        String[] listaNomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};

        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = sc.nextLine();

        int posicao = -1;
        for (int i = 0; i < listaNomes.length; i++) {
            if (listaNomes[i].equals(nomeBusca)) {
                posicao = i;
            }
        }

        if (posicao != -1) {
            System.out.println("O nome " + nomeBusca + " está na posição " + posicao + ".");
        } else {
            System.out.println("O nome " + nomeBusca + " não está na lista.");
        }

        sc.close();
    }
}
