package org.example.aula2110.construtor_builder;

import lombok.Builder;

@Builder
public class Agendamento {
    private final String nomePet;
    private final String servico;
    private final String horario;
    private final boolean perfume;
    private final boolean laco;
    private final boolean hidratacao;
    @Builder.Default
    private final String observacao = "";
    @Builder.Default
    private final double desconto = 0;

    public void mostrar() {
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + (observacao == null || observacao.isEmpty() ? "nenhuma" : observacao));
        System.out.printf("Desconto: %.0f%%%n", desconto * 100);
    }
}
