package org.example.aula0710.listarevisao0710;

public class ConcatenacaoPrintf {
    public static void main(String[] args) {

        // 1 - Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
        System.out.println("Ex1 - Concatenação de nome e idade");

        String nome = "Ana";
        int idade = 28;
        System.out.println(nome + " tem " + idade + " anos.");
        System.out.println();

        // 2 - Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
        System.out.println("Ex2 - Média com duas casas decimais");

        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.2f%n", media);
        System.out.println();

        // 3 - Crie uma variável com o preço de um produto e imprima com duas casas decimais.
        System.out.println("Ex3 - Preço com duas casas decimais");

        double precoProduto = 49.9;
        System.out.printf("Preço do produto: R$ %.2f%n", precoProduto);
        System.out.println();

        // 4 - Usando printf, imprima numa linha só o nome, a idade e a altura.
        System.out.println("Ex4 - printf com nome, idade e altura");

        String nomePessoa = "Ana";
        int idadePessoa = 28;
        double alturaPessoa = 1.65;
        System.out.printf("Nome: %s, Idade: %d, Altura: %.2f%n", nomePessoa, idadePessoa, alturaPessoa);
        System.out.println();

        // Mini-desafio - Crie variáveis para três produtos (nome e preço) e imprima um recibo.
        // Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.
        // Dica: crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.
        System.out.println("Mini-desafio - Recibo de compra");

        double total = 0;

        String produto1 = "Arroz";
        double preco1 = 25.90;
        total += preco1;

        String produto2 = "Feijão";
        double preco2 = 12.50;
        total += preco2;

        String produto3 = "Macarrão";
        double preco3 = 6.80;
        total += preco3;

        System.out.printf("%s - R$ %.2f%n", produto1, preco1);
        System.out.printf("%s - R$ %.2f%n", produto2, preco2);
        System.out.printf("%s - R$ %.2f%n", produto3, preco3);
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
