package org.example.aula2810;

public class Exercicio6 {

    // Se a condicao for verdadeira para o valor, executa a acao.
    static void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor)) {
            acao.executar();
        }
    }

    public static void main(String[] args) {

        // 6 - Interface Condicao com boolean testar(int n).
        // Crie um metodo static void executarSe(Condicao cond, int valor, Acao acao):
        // se cond.testar(valor) for true, chama acao.executar().
        // No main, chame passando uma condicao "e par", o valor 4 e uma acao que imprime
        // "é par!". Depois chame de novo com valor 7 e veja que nada acontece.
        executarSe(n -> n % 2 == 0, 4, () -> System.out.println("é par!"));
        executarSe(n -> n % 2 == 0, 7, () -> System.out.println("é par!"));
    }
}
