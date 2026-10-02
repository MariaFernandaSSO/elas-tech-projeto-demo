package org.example.aula3009;

public class Utilidades {

    public static void saudar(String nome) {
        System.out.printf("Olá, %s! Tudo bem \n", nome);
    }

    public static void dobro(int i) {
        System.out.println("O dobro de " + i + " é: " + i * 2);
    }

    public static void calcularMedia(double nota1, double nota2) {
        System.out.printf("A média das notas %.2f e %.2f é %.2f ", nota1, nota2, ((nota1 + nota2) / 2));
    }

    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static void somar(int n1, int n2) {
        System.out.println("O valor da soma é: " + (n1 + n2));
    }

    public static void somar(int n1, int n2, int n3) {
        System.out.println("O valor da soma é: " + (n1 + n2 + n3));
    }

    public static void somar(double n1, double n2) {
        System.out.println("O valor da soma é: " + (n1 + n2));
    }

    public static void saudacao() {
        System.out.println("Olá!");
    }

    public static void saudacao(String nome) {
        System.out.printf("Olá, %s! \n", nome);
    }
}
