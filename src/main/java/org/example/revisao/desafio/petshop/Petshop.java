package org.example.revisao.desafio.petshop;

public class Petshop {
    public static void main(String[] args) {

        /*
        1. A primeira ficha

        Crie a classe Petshop com o main e imprima a ficha de um pet com dados fixos guardados em variáveis:
        nome, espécie e peso. O peso deve sair com uma casa decimal.
         */
        String nome = "Mel";
        String especie = "Cachorro";
        double peso = 8.5;

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f kg%n", peso);
    }
}
