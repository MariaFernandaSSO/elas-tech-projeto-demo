package org.example.aula3010.lambda2;

public class Exercicio1 {

    public static void main(String[] args) {
        Runnable tarefa = () -> System.out.println("executando tarefa");
        Runnable outraTarefa = () -> System.out.println("executando outra tarefa");

        tarefa.run();
        outraTarefa.run();
    }
}
