package org.example.revisao.desafio.petshop;

import java.util.ArrayDeque;
import java.util.ArrayList;
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

        // Fila de banho: quem entra primeiro é atendido primeiro
        ArrayDeque<String> fila = new ArrayDeque<>();

        while (opcao != 0) {

            System.out.println();
            System.out.println("=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pelo nome");
            System.out.println("4 - Mostrar espécies");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender o próximo");
            System.out.println("7 - Executar serviços");
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

                        /*
                        14. Cachorro e gato

                        Variável do tipo da mãe, objeto da filha certa
                        conforme a espécie digitada.
                         */
                        Pet pet;

                        if (especie.equalsIgnoreCase("Cachorro")) {
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            pet = new Gato();
                        } else {
                            pet = new Pet();
                        }

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

                                /*
                                15. Cada um responde do seu jeito

                                Polimorfismo: cada pet chama o emitirSom()
                                da sua classe (Cachorro, Gato ou Pet).
                                 */
                                lista[i].emitirSom();
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

                    case 5:
                        // add() entra no fim da fila
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String petFila = sc.nextLine();

                        fila.add(petFila);
                        System.out.println(petFila + " entrou na fila.");
                        System.out.println("Fila agora: " + fila);
                        break;

                    case 6:
                        // isEmpty() antes: peek e poll numa fila vazia devolvem null
                        if (fila.isEmpty()) {
                            System.out.println("Fila vazia. Ninguém pra atender.");
                        } else {
                            String atendido = fila.poll();
                            System.out.println("Próximo da fila: " + atendido);
                            System.out.println("Atendendo " + atendido + "...");
                            System.out.println("Fila agora: " + fila);
                        }
                        break;

                    case 7:
                        // ArrayList do tipo da interface, guardando as implementações
                        System.out.print("Nome do pet: ");
                        String nomeServico = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();
                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico servico : servicos) {
                            servico.executar(nomeServico);
                        }
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

        /*
        16. Duas fichas, um nome só

        Dois métodos com o mesmo nome e quantidades de parâmetro diferentes.
        O Java escolhe pelo que você passou: isso é SOBRECARGA.
         */
        Pet mel = new Cachorro();
        mel.nome = "Mel";
        mel.especie = "Cachorro";
        mel.peso = 8.5;
        mel.porte = mel.definirPorte();

        mostrarFicha(mel);
        System.out.println("---");
        mostrarFicha(mel, "=== FICHA DO PET ===");

        sc.close();
    }

    // Mesmo nome, um parâmetro: mostra só o nome
    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    // Mesmo nome, dois parâmetros: título + ficha completa
    static void mostrarFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg%n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }
}
