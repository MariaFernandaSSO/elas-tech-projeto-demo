package org.example.aula2110.construtor;

/*
ATIVIDADE - Construtores (21/10)

Olhando só a linha do new, dá pra saber o que cada true/false significa?
Não. Os três booleanos aparecem apenas como true/false; sem consultar a
ordem dos parâmetros não dá para saber qual é perfume, laço ou hidratação.

Se trocar a ordem do perfume e do laço sem querer, o código compila?
Sim. Os dois são boolean, então o compilador aceita. O erro é silencioso:
o código compila, mas o comportamento fica errado.

No agendamento b, quantos valores foram digitados só para dizer "não quero isso"?
Três false. Além disso, também foi preciso passar "" e 0 para observação e desconto.
 */

public class Main {
    public static void main(String[] args) {

        Agendamento thor = new Agendamento(
                "Thor", "banho", "14h",
                true, true, false,
                "alérgico a shampoo", 0.10
        );

        Agendamento luna = new Agendamento(
                "Luna", "tosa", "10h",
                false, false, false,
                "", 0
        );

        Agendamento mel = new Agendamento(
                "Mel", "banho", "16h",
                false, false, true,
                "", 0
        );

        thor.mostrar();
        System.out.println("-----------------------");
        luna.mostrar();
        System.out.println("-----------------------");
        mel.mostrar();
    }
}
