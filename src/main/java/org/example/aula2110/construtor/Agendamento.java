package org.example.aula2110.construtor;

public class Agendamento {
    private final String nomePet;
    private final String servico;
    private final String horario;
    private final boolean perfume;
    private final boolean laco;
    private final boolean hidratacao;
    private final String observacao;
    private final double desconto;

    public Agendamento(String nomePet, String servico, String horario,
                       boolean perfume, boolean laco, boolean hidratacao,
                       String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar() {
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + (observacao.isEmpty() ? "nenhuma" : observacao));
        System.out.printf("Desconto: %.0f%%%n", desconto * 100);
    }
}
