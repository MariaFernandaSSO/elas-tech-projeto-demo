package org.example.aula3010.streams;

import java.util.List;

public class Stream1 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        System.out.println(pares);
    }
}
