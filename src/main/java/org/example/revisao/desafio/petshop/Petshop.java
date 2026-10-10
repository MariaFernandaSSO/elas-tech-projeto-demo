package org.example.revisao.desafio.petshop;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        6/7. Array de pets + O menu

        Array com espaço pra 5, contador de cadastrados, e o programa
        rodando até a pessoa escolher sair.
        opcao começa em -1: se começasse em 0, o while nem entraria.
         */
        Pet[] lista = new Pet[5];
        int total = 0;
        int opcao = -1;

        while (opcao != 0) {

            System.out.println();
            System.out.println("=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Cadastro: cada pet novo vai pra uma posição diferente
                    System.out.print("Nome do pet: ");
                    String nome = sc.nextLine();

                    System.out.print("Espécie: ");
                    String especie = sc.nextLine();

                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    Pet pet = new Pet();
                    pet.nome = nome;
                    pet.especie = especie;
                    pet.peso = peso;
                    pet.porte = pet.definirPorte();

                    lista[total] = pet;
                    total++;

                    System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                    break;

                case 0:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }
}
