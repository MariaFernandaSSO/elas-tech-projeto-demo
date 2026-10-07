package org.example.aula0710.listarevisao;

import java.util.Scanner;

public class ArraysAtv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o Ãºltimo.
        System.out.println("Ex1 - Primeiro, terceiro e Ãºltimo nome");
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};
        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Terceiro: " + nomes[2]);
        System.out.println("Ãšltimo: " + nomes[nomes.length - 1]);
        System.out.println();

        // 2 - Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laÃ§o.
        System.out.println("Ex2 - Notas com laÃ§o");
        int[] notas = {8, 6, 10, 7, 9};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println();

        // 3 - Com o mesmo array, calcule e imprima a soma e a mÃ©dia.
        System.out.println("Ex3 - Soma e mÃ©dia das notas");
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("Soma: " + soma);
        System.out.println("MÃ©dia: " + media);
        System.out.println();

        // 4 - Crie um array com 5 nÃºmeros e descubra qual Ã© o maior.
        System.out.println("Ex4 - Maior nÃºmero do array");
        int[] numeros = {12, 45, 7, 89, 33};
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior nÃºmero: " + maior);
        System.out.println();

        // 5 - Com {8, 5, 10, 4, 7}, conte quantas notas sÃ£o maiores ou iguais a 7.
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

        // Mini-desafio - Crie um array com 5 nomes. PeÃ§a um nome pra pessoa e diga em qual posiÃ§Ã£o ele estÃ¡.
        // Se nÃ£o estiver na lista, avise.
        // Dica: crie uma variÃ¡vel valendo -1 antes do laÃ§o â€” ela significa "ainda nÃ£o encontrei".
        // Se achar, guarde a posiÃ§Ã£o nela. Depois do laÃ§o, se ela ainda valer -1, Ã© porque nÃ£o estava na lista.
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
            System.out.println("O nome " + nomeBusca + " estÃ¡ na posiÃ§Ã£o " + posicao + ".");
        } else {
            System.out.println("O nome " + nomeBusca + " nÃ£o estÃ¡ na lista.");
        }

        sc.close();
    }
}
