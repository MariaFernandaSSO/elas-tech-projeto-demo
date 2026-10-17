package org.example.aula1610.exercicio6;

/*
Etapa 6. No main, crie um desenvolvedor e um gerente,
pague os dois usando uma classe folha de pagamento que recebe notificação tipo email ,

 e depois crie outra folha com notificação por SMS.


 // Pergunta final: quais princípios e conceitos de POO você usou em cada etapa?
 - Abstração, Encapsulamento, Controle acesso/validação (o setter impedindo valores negativos)
 - Herança e Polimorfismo @Override
 - Interfaces (Polimorfismo)
 - Inversão de Dependência

 */

import org.example.aula1610.exercicio6.entidades.Desenvolvedor;
import org.example.aula1610.exercicio6.entidades.Funcionario;
import org.example.aula1610.exercicio6.entidades.Gerente;
import org.example.aula1610.exercicio6.notificador.Notificador;
import org.example.aula1610.exercicio6.notificador.NotificadorEmail;
import org.example.aula1610.exercicio6.notificador.NotificadorSms;

public class Main {
    public static void main(String[] args) {
        Funcionario dev0 = new Desenvolvedor("Beatriz", 2000);
        Funcionario dev1 = new Desenvolvedor("Júlia", 2000);
        Funcionario gerente0 = new Gerente("Andie", 5000);

        Notificador notificadorEmail = new NotificadorEmail();
        FolhaPagamento folhaPagamentoEmail = new FolhaPagamento(notificadorEmail);
        folhaPagamentoEmail.pagar(dev0);
        folhaPagamentoEmail.pagar(dev1);
        folhaPagamentoEmail.pagar(gerente0);

        System.out.println("-----------------------");

        Notificador notificadorSms = new NotificadorSms();
        FolhaPagamento folhaPagamentoSms = new FolhaPagamento(notificadorSms);
        folhaPagamentoSms.pagar(dev0);
        folhaPagamentoSms.pagar(dev1);
        folhaPagamentoSms.pagar(gerente0);

        System.out.println("-----------------------");
    }
}
