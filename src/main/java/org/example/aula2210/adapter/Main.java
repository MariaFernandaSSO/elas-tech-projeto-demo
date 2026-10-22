package org.example.aula2210.adapter;

/*
ATIVIDADE - Adapter (22/10)

Questão 4.
Não dá para simplesmente escrever implements na classe da outra empresa porque
ela não pertence ao nosso projeto e não podemos alterar o código dela. Ela pode
até vir pronta em uma biblioteca, sem código-fonte disponível. Além disso, os
nomes dos métodos são diferentes: o nosso sistema espera pagar(), mas a classe
externa oferece sendPayment(). A solução é criar um adapter que implementa a
nossa interface e, por dentro, chama a classe de fora.

Questão 5.
Alternativa c) No método implementado da interface, dentro do adapter. É ali que
o adapter traduz a chamada do nosso sistema para a chamada da classe externa.
 */

public class Main {
    public static void main(String[] args) {
        // Pagamento pagamento = new PayPalAPI(); // não compila: PayPalAPI não implementa Pagamento

        Pagamento pagamento = new PayPalAdapter();
        pagamento.pagar();
    }
}
