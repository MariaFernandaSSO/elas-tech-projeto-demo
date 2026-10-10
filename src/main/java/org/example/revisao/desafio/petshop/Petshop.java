package org.example.revisao.desafio.petshop;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {

        /*
        2. Perguntando os dados

        Agora, ao invés de dados fixos, peça ao usuário nome, espécie e peso.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do pet: ");
        String nome = sc.nextLine();

        System.out.print("Espécie: ");
        String especie = sc.nextLine();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        /*
        1. A primeira ficha

        Imprima a ficha do pet com o peso com uma casa decimal.
         */
        System.out.println();
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f kg%n", peso);

        sc.close();
    }
}
