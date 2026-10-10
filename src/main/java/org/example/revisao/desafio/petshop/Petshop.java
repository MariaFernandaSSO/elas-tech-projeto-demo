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
        meuPet.porte = meuPet.definirPorte();

        /*
        6. Vários pets

        Crie um array do tipo Pet com espaço pra 5 pets e guarde o pet
        cadastrado na primeira posição.
         */
        Pet[] lista = new Pet[5];
        lista[0] = meuPet;

        /*
        Imprima os dados dele pegando direto do array, pela posição.
         */
        System.out.println();
        System.out.println("--- PETS CADASTRADOS ---");
        System.out.println(lista[0].nome + " (" + lista[0].especie + ") - "
                + lista[0].peso + " kg - Porte " + lista[0].porte);

        sc.close();
    }
}
