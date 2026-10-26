package org.example.aula2610.observer;

/*
ATIVIDADE - Observer (26/10)

Questão 1.
O Observer resolve o problema de manter várias partes do sistema avisadas
quando algo muda, sem que elas precisem ficar perguntando o tempo todo se
mudou. Exemplo do dia a dia: um canal do YouTube avisa os inscritos cada vez
que sai um vídeo novo, e cada inscrito é avisado do seu jeito.

Questão 2.
O Subject é quem tem o estado e muda, no nosso caso o Voo e o Estoque. O
Observer é quem se interessa por essa mudança, como o Passageiro, o
PainelAeroporto e o RegistroEstoque. O Subject avisa chamando o método da
interface (atualizar) em cada observador da lista, por isso ele só conhece a
interface e nunca as classes concretas.

Questão 3.
Não é preciso alterar nada na classe Pedido. Só criar a classe Entregador
implementando a interface de observador e chamar pedido.adicionarObservador
para ela entrar na lista. Isso acontece porque o Pedido conversa com a
interface, e não com as classes concretas. Se o Pedido tivesse classes
concretas escritas dentro dele, aí sim precisaria mudar.
 */

public class Main {
    public static void main(String[] args) {

        Voo voo = new Voo();
        Passageiro passageiro = new Passageiro();

        voo.adicionarObservador(passageiro);
        voo.mudarStatus("Embarque iniciado");
        System.out.println();

        Voo vooComPainel = new Voo();
        PainelAeroporto painel = new PainelAeroporto();

        vooComPainel.adicionarObservador(new Passageiro());
        vooComPainel.adicionarObservador(painel);
        vooComPainel.mudarStatus("Atrasado");
        System.out.println();

        Estoque estoque = new Estoque();
        estoque.adicionarObservador(new RegistroEstoque());

        estoque.setQuantidade(10);
        estoque.setQuantidade(5);
    }
}
