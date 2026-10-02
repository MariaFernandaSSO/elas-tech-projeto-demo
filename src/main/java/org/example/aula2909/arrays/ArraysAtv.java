package org.example.aula2909.arrays;

import java.util.Scanner;

public class ArraysAtv {
    public static void main(String[] args) {

        // 1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
        //
        System.out.println("Ex1 - Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.");

        String[] nomes = { "Ana", "Joana", "Elize", "Rosa", "Elvira"};

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);

        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        System.out.println("Ex2 - Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: 'Nota 1: 8'");

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d : %d \n", (i + 1), notas[i]);
        }

        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        System.out.println("Ex3 - Com o mesmo array de notas, calcule e mostre a soma e a média.");

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = soma / notas.length;

        System.out.printf("A soma das notas é %.1f e a média é %.1f", soma, media);

        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Vou precisar que digite 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", (i + 1));
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros digitados de trás para frente:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}
