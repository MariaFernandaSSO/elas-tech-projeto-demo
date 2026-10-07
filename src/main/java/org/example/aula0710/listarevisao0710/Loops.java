package org.example.aula0710.listarevisao0710;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Imprima os números de 1 a 20, um por linha.
        System.out.println("Ex1 - Números de 1 a 20 (for)");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println();

        // 2 - Imprima a contagem regressiva de 10 até 1 e depois "Fim!".
        System.out.println("Ex2 - Contagem regressiva");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");
        System.out.println();

        // 3 - Peça um número e mostre a tabuada dele de 1 a 10.
        System.out.println("Ex3 - Tabuada");
        System.out.print("Digite um número para ver a tabuada: ");
        int numeroTabuada = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numeroTabuada, i, numeroTabuada * i);
        }
        System.out.println();

        // 4 - Imprima só os números pares de 1 a 30.
        System.out.println("Ex4 - Números pares de 1 a 30");
        for (int i = 2; i <= 30; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        // 5 - Usando for, some todos os números de 1 a 100 e mostre o resultado.
        System.out.println("Ex5 - Soma de 1 a 100");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
        System.out.println();

        // 6 - Refaça o primeiro exercício com while. Compare os dois códigos.
        System.out.println("Ex6 - Números de 1 a 20 (while)");
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        // 7 - Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.
        System.out.println("Ex7 - do while com energia");
        int energia = 3;
        do {
            System.out.println("Jogando...");
            energia--;
        } while (energia > 0);
        System.out.println();

        // Mini-desafio - Peça um número e desenhe um triângulo de asteriscos com essa altura.
        // Dica: você vai precisar de um laço dentro do outro. O de fora controla a linha;
        // o de dentro imprime os asteriscos daquela linha.
        System.out.println("Mini-desafio - Triângulo de asteriscos");
        System.out.print("Digite a altura: ");
        int altura = sc.nextInt();
        sc.nextLine();

        for (int linha = 1; linha <= altura; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
