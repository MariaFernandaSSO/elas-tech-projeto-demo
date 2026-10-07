package org.example.aula0710.listarevisao;

public class VariaveisTipos {
    public static void main(String[] args) {

        // 1 - Crie variÃ¡veis com seu nome, sua idade, sua altura e se vocÃª jÃ¡ programou antes. Imprima cada uma.
        System.out.println("Ex1 - VariÃ¡veis com nome, idade, altura e se jÃ¡ programou antes");

        String nome = "Ana";
        int idade = 28;
        double altura = 1.65;
        boolean jaProgramou = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("JÃ¡ programou antes: " + jaProgramou);
        System.out.println();

        // 2 - Crie uma variÃ¡vel cidade e imprima: "Eu moro em Salvador."
        System.out.println("Ex2 - VariÃ¡vel cidade");

        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade + ".");
        System.out.println();

        // 3 - Crie primeiroNome e sobrenome e imprima o nome completo numa linha sÃ³.
        System.out.println("Ex3 - Nome completo");

        String primeiroNome = "Ana";
        String sobrenome = "Souza";
        System.out.println(primeiroNome + " " + sobrenome);
        System.out.println();

        // 4 - Crie uma variÃ¡vel preco com 29.90 e imprima o valor dela numa frase.
        System.out.println("Ex4 - PreÃ§o");

        double preco = 29.90;
        System.out.println("O produto custa R$ " + preco);
        System.out.println();

        // 5 - Crie uma variÃ¡vel temCarteira com true e imprima.
        System.out.println("Ex5 - Tem carteira");

        boolean temCarteira = true;
        System.out.println(temCarteira);
        System.out.println();

        // Mini-desafio - VocÃª tem a = 10 e b = 20. FaÃ§a a valer 20 e b valer 10, sem escrever os nÃºmeros 10 e 20 de novo.
        // Dica: vocÃª vai precisar de uma terceira variÃ¡vel pra guardar alguma coisa antes.
        System.out.println("Mini-desafio - Trocar valores de a e b");

        int a = 10;
        int b = 20;
        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
