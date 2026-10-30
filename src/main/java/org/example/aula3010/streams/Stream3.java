package org.example.aula3010.streams;

import java.util.List;

public class Stream3 {

    public static void main(String[] args) {
        List<String> cidades = List.of("São Paulo", "Rio de Janeiro", "Santos", "Salvador", "Curitiba");

        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();

        System.out.println("Cidades que começam com S: " + quantidade);
    }
}
