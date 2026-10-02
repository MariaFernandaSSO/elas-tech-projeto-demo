package org.example.aula3009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EX - Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime 'Bem-vinda ao curso de Java!' Chame ele no main.");

        mostrarBoasVindas();

        System.out.println("2 — Crie um método saudar(String nome) que imprime 'Olá, [nome]! Tudo bem?'. Chame ele três vezes, passando nomes diferentes.");

        Utilidades.saudar("Maria");
        Utilidades.saudar("Angela");
        Utilidades.saudar("Carol");

        System.out.println("3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado");

        Utilidades.dobro(5);

        System.out.println("4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        Utilidades.calcularMedia(nota1, nota2);

        System.out.println("5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.");

        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade :/");
        }

        System.out.println("6 — Crie três métodos com o mesmo nome somar:");
        Utilidades.somar(1, 2);
        Utilidades.somar(1, 2, 3);
        Utilidades.somar(1.5, 2.5);


        System.out.println("7 — Crie dois métodos chamados saudacao:");

        Utilidades.saudacao();
        Utilidades.saudacao("Maria Fernanda");

    }

    private static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }
}
