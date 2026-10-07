package org.example.aula0710.colecoes.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapAtv {
    public static void main(String[] args) {

        // 1 - Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.
        System.out.println("Ex1 - HashMap de nomes e idades");

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 28);
        pessoas.put("Bruno", 35);
        pessoas.put("Carla", 22);

        System.out.println(pessoas);
        System.out.println("Idade da Carla: " + pessoas.get("Carla"));
        System.out.println();

        // 2 - Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00, imprima,
        // e depois faça put de "café" DE NOVO com valor 7.50. Imprima outra vez e veja o que aconteceu com o tamanho.
        System.out.println("Ex2 - HashMap de produtos com put duplicado");

        Map<String, Double> produtos = new HashMap<>();
        produtos.put("café", 5.00);
        System.out.println(produtos);
        System.out.println("Tamanho: " + produtos.size());

        produtos.put("café", 7.50);
        System.out.println("Depois do put repetido: " + produtos);
        System.out.println("Tamanho: " + produtos.size());
        System.out.println();

        // 3 - Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey dentro de um if
        // para mostrar o telefone de alguém que está na agenda e de alguém que não está.
        System.out.println("Ex3 - Agenda com containsKey");

        Map<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "99999-1111");
        agenda.put("Bruno", "99999-2222");

        if (agenda.containsKey("Ana")) {
            System.out.println("Telefone da Ana: " + agenda.get("Ana"));
        }

        if (agenda.containsKey("Carlos")) {
            System.out.println("Telefone do Carlos: " + agenda.get("Carlos"));
        } else {
            System.out.println("Carlos não está na agenda.");
        }
        System.out.println();

        // 4 - Crie um HashMap de estoque (produto -> quantidade) com dois itens. Use getOrDefault para mostrar
        // a quantidade de um produto que existe e de um que não existe (devolvendo 0).
        // Depois tente com get normal no que não existe e compare.
        System.out.println("Ex4 - Estoque com getOrDefault e get");

        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("arroz", 10);
        estoque.put("feijão", 5);

        System.out.println("Quantidade de arroz: " + estoque.getOrDefault("arroz", 0));
        System.out.println("Quantidade de açúcar: " + estoque.getOrDefault("açúcar", 0));
        System.out.println("get normal de açúcar: " + estoque.get("açúcar"));
        System.out.println();

        // 5 - Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho. Remova uma delas e imprima de novo.
        System.out.println("Ex5 - HashMap de notas com remove");

        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 8.5);
        notas.put("Bruno", 7.0);
        notas.put("Carla", 9.2);

        System.out.println(notas);
        System.out.println("Tamanho: " + notas.size());

        notas.remove("Bruno");

        System.out.println("Depois do remove: " + notas);
        System.out.println("Tamanho: " + notas.size());
    }
}
