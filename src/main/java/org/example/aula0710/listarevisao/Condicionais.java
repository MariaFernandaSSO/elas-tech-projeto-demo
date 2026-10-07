package org.example.aula0710.listarevisao;

import java.util.Locale;
import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // 1 - PeÃ§a a idade e diga se a pessoa Ã© maior ou menor de idade.
        System.out.println("Ex1 - Maior ou menor de idade");
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        if (idade >= 18) {
            System.out.println("VocÃª Ã© maior de idade.");
        } else {
            System.out.println("VocÃª Ã© menor de idade.");
        }
        System.out.println();

        // 2 - PeÃ§a um nÃºmero e diga se ele Ã© par ou Ã­mpar.
        System.out.println("Ex2 - Par ou Ã­mpar");
        System.out.print("Digite um nÃºmero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        if (numero % 2 == 0) {
            System.out.println("O nÃºmero " + numero + " Ã© par.");
        } else {
            System.out.println("O nÃºmero " + numero + " Ã© Ã­mpar.");
        }
        System.out.println();

        // 3 - PeÃ§a dois nÃºmeros e diga qual Ã© o maior. Se forem iguais, avise.
        System.out.println("Ex3 - Maior nÃºmero");
        System.out.print("Digite o primeiro nÃºmero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo nÃºmero: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        if (n1 > n2) {
            System.out.println("O maior nÃºmero Ã© " + n1 + ".");
        } else if (n2 > n1) {
            System.out.println("O maior nÃºmero Ã© " + n2 + ".");
        } else {
            System.out.println("Os dois nÃºmeros sÃ£o iguais.");
        }
        System.out.println();

        // 4 - PeÃ§a uma nota e mostre "Aprovada" (7 ou mais), "RecuperaÃ§Ã£o" (5 a 6.9) ou "Reprovada".
        System.out.println("Ex4 - SituaÃ§Ã£o da nota");
        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();
        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("RecuperaÃ§Ã£o");
        } else {
            System.out.println("Reprovada");
        }
        System.out.println();

        // 5 - PeÃ§a um nÃºmero de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opÃ§Ã£o.
        System.out.println("Ex5 - Sabor de sorvete com switch");
        System.out.print("Digite um nÃºmero de 1 a 3: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                System.out.println("Sabor: Chocolate");
                break;
            case 2:
                System.out.println("Sabor: Morango");
                break;
            case 3:
                System.out.println("Sabor: Baunilha");
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida.");
                break;
        }
        System.out.println();

        // 6 - PeÃ§a a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.
        System.out.println("Ex6 - Valor do ingresso");
        System.out.print("Digite a idade: ");
        int idadeIngresso = sc.nextInt();
        sc.nextLine();
        if (idadeIngresso < 12 || idadeIngresso >= 60) {
            System.out.println("Valor do ingresso: R$ 10");
        } else {
            System.out.println("Valor do ingresso: R$ 25");
        }
        System.out.println();

        // Mini-desafio - PeÃ§a os trÃªs lados de um triÃ¢ngulo e classifique:
        // todos iguais -> EquilÃ¡tero; dois iguais -> IsÃ³sceles; todos diferentes -> Escaleno.
        // Dica: a ordem dos testes importa. Um triÃ¢ngulo equilÃ¡tero tambÃ©m tem dois lados iguais,
        // entÃ£o o teste do isÃ³sceles nÃ£o pode vir antes do equilÃ¡tero.
        System.out.println("Mini-desafio - ClassificaÃ§Ã£o de triÃ¢ngulo");
        System.out.print("Digite o lado A: ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        double ladoC = sc.nextDouble();
        sc.nextLine();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("TriÃ¢ngulo EquilÃ¡tero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("TriÃ¢ngulo IsÃ³sceles");
        } else {
            System.out.println("TriÃ¢ngulo Escaleno");
        }

        sc.close();
    }
}
