package org.example.aula0710.listarevisao;

public class ConcatenacaoPrintf {
    public static void main(String[] args) {

        // 1 - Com seu nome e sua idade em variÃ¡veis, imprima: "Ana tem 28 anos."
        System.out.println("Ex1 - ConcatenaÃ§Ã£o de nome e idade");

        String nome = "Ana";
        int idade = 28;
        System.out.println(nome + " tem " + idade + " anos.");
        System.out.println();

        // 2 - Crie nota1 = 8.0 e nota2 = 7.0. Calcule a mÃ©dia e imprima com duas casas decimais.
        System.out.println("Ex2 - MÃ©dia com duas casas decimais");

        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.printf("MÃ©dia: %.2f%n", media);
        System.out.println();

        // 3 - Crie uma variÃ¡vel com o preÃ§o de um produto e imprima com duas casas decimais.
        System.out.println("Ex3 - PreÃ§o com duas casas decimais");

        double precoProduto = 49.9;
        System.out.printf("PreÃ§o do produto: R$ %.2f%n", precoProduto);
        System.out.println();

        // 4 - Usando printf, imprima numa linha sÃ³ o nome, a idade e a altura.
        System.out.println("Ex4 - printf com nome, idade e altura");

        String nomePessoa = "Ana";
        int idadePessoa = 28;
        double alturaPessoa = 1.65;
        System.out.printf("Nome: %s, Idade: %d, Altura: %.2f%n", nomePessoa, idadePessoa, alturaPessoa);
        System.out.println();

        // Mini-desafio - Crie variÃ¡veis para trÃªs produtos (nome e preÃ§o) e imprima um recibo.
        // Cada linha deve ter o nome e o preÃ§o, e a Ãºltima linha mostra o total, tudo com duas casas decimais.
        // Dica: crie uma variÃ¡vel total comeÃ§ando em zero, antes dos produtos, e vÃ¡ somando cada preÃ§o nela.
        System.out.println("Mini-desafio - Recibo de compra");

        double total = 0;

        String produto1 = "Arroz";
        double preco1 = 25.90;
        total += preco1;

        String produto2 = "FeijÃ£o";
        double preco2 = 12.50;
        total += preco2;

        String produto3 = "MacarrÃ£o";
        double preco3 = 6.80;
        total += preco3;

        System.out.printf("%s - R$ %.2f%n", produto1, preco1);
        System.out.printf("%s - R$ %.2f%n", produto2, preco2);
        System.out.printf("%s - R$ %.2f%n", produto3, preco3);
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
