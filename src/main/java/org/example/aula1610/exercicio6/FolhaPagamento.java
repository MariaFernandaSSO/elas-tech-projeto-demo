package org.example.aula1610.exercicio6;

import org.example.aula1610.exercicio6.entidades.Funcionario;
import org.example.aula1610.exercicio6.notificador.Notificador;

public class FolhaPagamento {

    private Notificador notificador;

    public FolhaPagamento(Notificador notificador){
        this.notificador = notificador;
    }

    public void pagar(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 0) {
            double salarioFinal = funcionario.calcularSalario();
            String mensagem = "Olá " + funcionario.getNome() +
                    ", seu salário caiu na conta. No valor de R$ " + salarioFinal;
            notificador.notificar(mensagem);
        } else {
            System.out.println("Não é possível pagar salário se o valor for negativo!");
        }
    }

}
