package org.example.revisao.desafio.petshop;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {

        /*
        2. Perguntando os dados

        Peça ao usuário nome, espécie e peso.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do pet: ");
        String nome = sc.nextLine();

        System.out.print("Espécie: ");
        String especie = sc.nextLine();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        /*
        4. Juntando tudo num objeto

        Crie o pet e preencha os atributos.
         */
        Pet meuPet = new Pet();
        meuPet.nome = nome;
        meuPet.especie = especie;
        meuPet.peso = peso;

        /*
        5. Tirando o porte do main

        Todo aquele if virou uma linha só.
        Atenção: o peso foi preenchido antes de chamar o método.
         */
        meuPet.porte = meuPet.definirPorte();

        /*
        1. A primeira ficha

        Imprima a ficha do pet pegando tudo do objeto.
         */
        System.out.println();
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + meuPet.nome);
        System.out.println("Espécie: " + meuPet.especie);
        System.out.printf("Peso: %.1f kg%n", meuPet.peso);
        System.out.println("Porte: " + meuPet.porte);

        sc.close();
    }
}
