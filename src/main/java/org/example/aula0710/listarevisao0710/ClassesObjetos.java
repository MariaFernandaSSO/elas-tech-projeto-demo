package org.example.aula0710.listarevisao0710;

public class ClassesObjetos {
    public static void main(String[] args) {

        // 1 - Crie uma classe Pet com nome, raca e peso. Em outra classe, crie um objeto, preencha e imprima tudo.
        System.out.println("Ex1 - Criar e imprimir um Pet");

        Pet pet1 = new Pet();
        pet1.nome = "Rex";
        pet1.raca = "Labrador";
        pet1.peso = 25.5;

        System.out.println("Nome: " + pet1.nome);
        System.out.println("Raça: " + pet1.raca);
        System.out.println("Peso: " + pet1.peso);
        System.out.println();

        // 2 - Crie dois pets diferentes e imprima as duas fichas.
        System.out.println("Ex2 - Duas fichas de pets");

        Pet pet2 = new Pet();
        pet2.nome = "Mimi";
        pet2.raca = "Siamês";
        pet2.peso = 4.2;

        System.out.println("Ficha 1 - Nome: " + pet1.nome + ", Raça: " + pet1.raca + ", Peso: " + pet1.peso);
        System.out.println("Ficha 2 - Nome: " + pet2.nome + ", Raça: " + pet2.raca + ", Peso: " + pet2.peso);
        System.out.println();

        // 3 - Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.
        System.out.println("Ex3 - Valor total em estoque do produto");

        Produto produto = new Produto();
        produto.nome = "Arroz";
        produto.preco = 5.50;
        produto.quantidade = 10;

        double valorTotalEstoque = produto.preco * produto.quantidade;
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço unitário: R$ " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor total em estoque: R$ " + valorTotalEstoque);
        System.out.println();

        // 4 - Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.
        System.out.println("Ex4 - Ficha da aluna com média");

        Aluna aluna = new Aluna();
        aluna.nome = "Maria";
        aluna.nota1 = 8.0;
        aluna.nota2 = 7.0;
        aluna.media = (aluna.nota1 + aluna.nota2) / 2;

        System.out.println("Nome: " + aluna.nome);
        System.out.println("Nota 1: " + aluna.nota1);
        System.out.println("Nota 2: " + aluna.nota2);
        System.out.println("Média: " + aluna.media);
        System.out.println();

        // Mini-desafio - Crie uma classe Jogadora com nome e pontos. Crie três jogadoras com
        // pontuações diferentes e descubra qual tem a maior pontuação. Imprima o nome dela.
        // Dica: compare os atributos pontos de cada objeto, igual você compararia números comuns.
        // Guarde numa variável o nome da jogadora com a maior pontuação encontrada até agora.
        System.out.println("Mini-desafio - Jogadora com maior pontuação");

        Jogadora jogadora1 = new Jogadora();
        jogadora1.nome = "Ana";
        jogadora1.pontos = 85;

        Jogadora jogadora2 = new Jogadora();
        jogadora2.nome = "Beatriz";
        jogadora2.pontos = 92;

        Jogadora jogadora3 = new Jogadora();
        jogadora3.nome = "Carla";
        jogadora3.pontos = 78;

        Jogadora melhor = jogadora1;
        if (jogadora2.pontos > melhor.pontos) {
            melhor = jogadora2;
        }
        if (jogadora3.pontos > melhor.pontos) {
            melhor = jogadora3;
        }

        System.out.println("Jogadora com maior pontuação: " + melhor.nome);
    }
}
