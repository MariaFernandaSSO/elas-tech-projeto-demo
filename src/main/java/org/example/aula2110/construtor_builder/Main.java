package org.example.aula2110.construtor_builder;

/*
ATIVIDADE - Construtores (21/10) refatorada com Builder

Com o Builder, cada valor é nomeado na linha do build: dá para saber o que
cada true/false significa sem consultar a ordem dos parâmetros. Trocar a
ordem de perfume e laço deixa de ser possível por engano.

Além disso, os valores padrão (false, "" e 0) não precisam mais ser digitados.
 */

public class Main {
    public static void main(String[] args) {

        Agendamento thor = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .observacao("alérgico a shampoo")
                .desconto(0.10)
                .build();

        Agendamento luna = Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();

        Agendamento mel = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        thor.mostrar();
        System.out.println("-----------------------");
        luna.mostrar();
        System.out.println("-----------------------");
        mel.mostrar();
    }
}
