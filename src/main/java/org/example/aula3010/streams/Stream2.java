package org.example.aula3010.streams;

import java.util.List;

public class Stream2 {

    public static void main(String[] args) {
        List<String> frutas = List.of("banana", "maçã", "uva", "morango");

        frutas.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
