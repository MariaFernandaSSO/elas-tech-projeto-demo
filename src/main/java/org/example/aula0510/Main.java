package org.example.aula0510;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        System.out.println("--- Exercício 1 ---");
        List<String> nomesVazia = new ArrayList<>();
        nomesVazia.add("Ana");
        nomesVazia.add("Carlos");
        nomesVazia.add("Beatriz");
        System.out.println("Lista de nomes: " + nomesVazia);

        // 2. Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        System.out.println("\n--- Exercício 2 ---");
        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Uva");
        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("Última fruta: " + frutas.get(frutas.size() - 1));
        System.out.println("Quantidade de frutas: " + frutas.size());

        // 3. Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        System.out.println("\n--- Exercício 3 ---");
        List<String> nomesQuatro = new ArrayList<>(Arrays.asList("João", "Maria", "Pedro", "Sofia"));
        System.out.println("Antes: " + nomesQuatro);
        nomesQuatro.set(2, "Lucas");
        System.out.println("Depois: " + nomesQuatro);

        // 4. Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        System.out.println("\n--- Exercício 4 ---");
        List<String> cidades = new ArrayList<>(Arrays.asList("Lisboa", "Porto", "Coimbra", "Faro"));
        cidades.remove(1);
        System.out.println("Quantidade de cidades restantes: " + cidades.size());

        // 5. Crie uma lista com seis nomes e imprima todos usando um laço, no formato "0: Ana".
        System.out.println("\n--- Exercício 5 ---");
        List<String> seisNomes = Arrays.asList("Ana", "Bruno", "Carla", "Daniel", "Eduarda", "Fernando");
        for (int i = 0; i < seisNomes.size(); i++) {
            System.out.println(i + ": " + seisNomes.get(i));
        }

        // 6. Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
        System.out.println("\n--- Exercício 6 ---");
        List<String> cincoNomes = Arrays.asList("Gabriel", "Helena", "Igor", "Juliana", "Marcos");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome para pesquisar: ");
        String nomeProcurado = scanner.nextLine();

        int posicao = cincoNomes.indexOf(nomeProcurado);

        if (posicao != -1) {
            System.out.println("O nome " + nomeProcurado + " está na lista na posição (índice) " + posicao + ".");
        } else {
            System.out.println("O nome " + nomeProcurado + " não se encontra na lista.");
        }

        scanner.close();
    }
}
