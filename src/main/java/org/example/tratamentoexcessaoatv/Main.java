package org.example.tratamentoexcessaoatv;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EXERCÍCIO 1
        System.out.println("\nex1 - Divisão de dois inteiros");
        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não dá pra dividir por zero.");
        }

        // EXERCÍCIO 2
        System.out.println("\nex2 - Consultar nota no array");
        double[] notas = {8.5, 7.0, 9.2, 6.5, 10.0};
        try {
            System.out.print("Digite uma posição (0 a 4): ");
            int pos = sc.nextInt();
            System.out.println("Nota na posição " + pos + ": " + notas[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: O array só vai de 0 a 4.");
        }

        // EXERCÍCIO 3
        System.out.println("\nex3 - Validação de idade");
        try {
            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Idade digitada: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas números inteiros.");
            sc.nextLine();
        }

        // EXERCÍCIO 4
        System.out.println("\nex4 - Teste de NullPointerException");
        String nome = null;
        try {
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido.");
        }

        // EXERCÍCIO 5
        System.out.println("\nex5 - Resto da divisão por 100");
        try {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int resto = 100 % numero;
            System.out.println("Resto da divisão de 100 por " + numero + ": " + resto);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }

        // EXERCÍCIO 6
        System.out.println("\nex6 - Acesso fora do array e continuidade");
        String[] nomes = {"Ana", "Bruno", "Carla"};
        try {
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");

        sc.close();
    }
}