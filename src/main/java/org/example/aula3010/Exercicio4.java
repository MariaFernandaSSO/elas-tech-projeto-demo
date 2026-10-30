package org.example.aula3010;

import java.util.function.Predicate;

public class Exercicio4 {

    public static void main(String[] args) {
        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        System.out.println("O número 5 é maior que 10? " + maiorQueDez.test(5));
        System.out.println("O número 15 é maior que 10? " + maiorQueDez.test(15));

        Predicate<String> textoVazio = texto -> texto.isEmpty();
        System.out.println("A String \"\" está vazia? " + textoVazio.test(""));
        System.out.println("A String \"Java\" está vazia? " + textoVazio.test("Java"));
    }
}
