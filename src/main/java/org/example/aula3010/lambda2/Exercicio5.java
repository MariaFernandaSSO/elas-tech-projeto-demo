package org.example.aula3010.lambda2;

import java.util.function.Function;

public class Exercicio5 {

    public static void main(String[] args) {
        Function<Integer, String> formatarNota = numero -> "Nota fiscal nº: " + numero;
        System.out.println(formatarNota.apply(1542));

        Function<String, Integer> contarLetras = palavra -> palavra.length();
        System.out.println("A palavra 'Professor' tem " + contarLetras.apply("Professor") + " letras.");
    }
}
