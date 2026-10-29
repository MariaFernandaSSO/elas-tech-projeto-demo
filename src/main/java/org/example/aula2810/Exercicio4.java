package org.example.aula2810;

public class Exercicio4 {

    // Antes eu guardava a acao e chamava. Agora eu entrego a acao e deixo o metodo decidir
    // o que fazer com ela.
    static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    public static void main(String[] args) {

        // 4 - Interface Acao com void executar().
        // Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
        // No main, chame repetir passando uma lambda que imprime "oi".
        // Repare que voce nao cria variavel, a lambda vai direto como argumento.
        repetir(() -> System.out.println("oi"));
    }
}
