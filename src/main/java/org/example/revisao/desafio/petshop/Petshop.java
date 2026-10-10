package org.example.revisao.desafio.petshop;

import java.util.HashSet;
import java.util.InputMismatchException;
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
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pelo nome");
            System.out.println("4 - Mostrar espécies");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            /*
            10. Trate erros do menu

            try/catch em volta da leitura e do switch: se a leitura der erro,
            o switch nem roda. O sc.nextLine() do catch limpa a letra digitada
            pra não virar loop infinito.
             */
            try {
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

                    case 2:
                        // Percorre só até o total: não dá pra ler posição vazia
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println();
                            System.out.println("--- PETS CADASTRADOS ---");
                            for (int i = 0; i < total; i++) {
                                System.out.println(lista[i].nome + " (" + lista[i].especie + ") - "
                                        + lista[i].peso + " kg - Porte " + lista[i].porte);
                            }
                        }
                        break;

                    case 3:
                        // Busca ignorando maiúsculas e minúsculas
                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println("Encontrado: " + lista[i].nome + " ("
                                        + lista[i].especie + ") - " + lista[i].peso + " kg");
                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        // HashSet descarta repetidos: cada espécie aparece uma vez só
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(lista[i].especie);
                        }

                        System.out.println();
                        System.out.println("--- ESPÉCIES CADASTRADAS ---");
                        for (String nomeEspecie : especies) {
                            System.out.println("- " + nomeEspecie);
                        }
                        System.out.println("Total de espécies diferentes: " + especies.size());
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
