package org.example.aula0710.colecoes.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetAtv {
    public static void main(String[] args) {

        // 1 - Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido. Imprima o conjunto e o tamanho.
        System.out.println("Ex1 - HashSet de nomes com um repetido");

        Set<String> nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Ana");

        System.out.println(nomes);
        System.out.println("Tamanho: " + nomes.size());
        System.out.println();

        // 2 - Crie um HashSet de cores usando addAll. Depois use contains dentro de um if para avisar se a cor "verde" já está no conjunto ou não.
        System.out.println("Ex2 - HashSet de cores com contains");

        Set<String> cores = new HashSet<>();
        cores.addAll(List.of("azul", "amarelo", "vermelho", "verde"));

        if (cores.contains("verde")) {
            System.out.println("A cor verde já está no conjunto.");
        } else {
            System.out.println("A cor verde não está no conjunto.");
        }
        System.out.println();

        // 3 - Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para tirar os repetidos. Imprima os dois e compare.
        System.out.println("Ex3 - Removendo repetidos com HashSet");

        List<String> listaComRepetidos = new ArrayList<>();
        listaComRepetidos.add("Ana");
        listaComRepetidos.add("Bruno");
        listaComRepetidos.add("Ana");
        listaComRepetidos.add("Carla");
        listaComRepetidos.add("Bruno");

        Set<String> semRepetidos = new HashSet<>(listaComRepetidos);

        System.out.println("Lista original: " + listaComRepetidos);
        System.out.println("Conjunto sem repetidos: " + semRepetidos);
        System.out.println();

        // 4 - Crie um HashSet com três CPFs e imprima. Depois remova um deles e imprima de novo, junto com o tamanho.
        System.out.println("Ex4 - HashSet de CPFs com remove");

        Set<String> cpfs = new HashSet<>();
        cpfs.add("111.222.333-44");
        cpfs.add("555.666.777-88");
        cpfs.add("999.888.777-66");

        System.out.println("CPFs: " + cpfs);

        cpfs.remove("555.666.777-88");

        System.out.println("Depois do remove: " + cpfs);
        System.out.println("Tamanho: " + cpfs.size());
        System.out.println();

        // 5 - Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.
        System.out.println("Ex5 - Percorrendo HashSet com for");

        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println();

        // 6 - Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e imprima o isEmpty() de novo.
        System.out.println("Ex6 - HashSet vazio com isEmpty");

        Set<String> conjuntoVazio = new HashSet<>();
        System.out.println("Está vazio? " + conjuntoVazio.isEmpty());

        conjuntoVazio.add("Java");
        System.out.println("Está vazio? " + conjuntoVazio.isEmpty());
    }
}
