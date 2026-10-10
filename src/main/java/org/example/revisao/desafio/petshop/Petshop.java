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
        3. O porte do pet

        Antes de mostrar a ficha, descubra o porte do pet pelo peso:
        menos de 10 kg -> Pequeno
        de 10 a menos de 25 kg -> Médio
        25 kg ou mais -> Grande
         */
        String porte;

        if (peso < 10) {
            porte = "Pequeno";
        } else if (peso < 25) {
            porte = "Médio";
        } else {
            porte = "Grande";
        }

        /*
        1. A primeira ficha

        Imprima a ficha do pet, agora com o porte.
         */
        System.out.println();
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f kg%n", peso);
        System.out.println("Porte: " + porte);

        sc.close();
    }
}
