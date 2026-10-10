package org.example.aula1010.foreach;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        1 - Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
        um por linha.
         */
        System.out.println("Ex1 - Array de nomes com for-each");

        String[] nomes = {"Ana", "Maria", "Joao", "Carla"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println();

        /*
        2 - Crie um ArrayList com 5 notas e imprima todas usando for-each.
         */
        System.out.println("Ex2 - ArrayList de notas com for-each");

        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(9.0);
        notas.add(6.0);
        notas.add(8.5);
        notas.add(10.0);

        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println();

        /*
        3 - Com o array de notas {8, 6, 10, 7}, use for-each para somar
        todas e mostrar a soma e a média.
         */
        System.out.println("Ex3 - Soma e media com for-each");

        int[] notasInt = {8, 6, 10, 7};
        int soma = 0;

        for (int nota : notasInt) {
            soma = soma + nota;
        }

        double media = (double) soma / notasInt.length;
        System.out.println("Soma: " + soma);
        System.out.printf("Media: %.1f%n", media);
        System.out.println();

        /*
        4 - Com um array de nomes, use for-each e um if para contar quantos
        têm mais de 5 letras. Mostre o total. Dica: usem o método length.
         */
        System.out.println("Ex4 - Contando nomes com mais de 5 letras");

        String[] nomesEx4 = {"Alexandre", "Ana", "Beatriz", "Caio", "Fernanda"};
        int contador = 0;

        for (String nome : nomesEx4) {
            if (nome.length() > 5) {
                contador++;
            }
        }

        System.out.println("Total de nomes com mais de 5 letras: " + contador);
        System.out.println();

        /*
        5 - Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
        usando o índice. Deixe os dois na mesma classe e compare.
         */
        System.out.println("Ex5 - O mesmo array do Ex1, agora com for normal");

        // for-each: mais limpo quando nao precisa do indice
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---");

        // for normal: preciso quando quiser saber a posicao (i)
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posicao " + i + ": " + nomes[i]);
        }
    }
}
