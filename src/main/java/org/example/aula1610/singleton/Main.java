package org.example.aula1610.singleton;

/*
ATIVIDADE - Singleton (16/10)

1. O que o padrão Singleton garante?
b) Que exista apenas um objeto da classe no programa.

2. Por que o construtor de um Singleton é private?
Para impedir que outras classes usem new. A própria classe controla a criação
do objeto, normalmente pelo método getInstancia().

3. Complete a lacuna:
private static Configuracao instancia;
c) static

4. O que acontece se alguém tentar escrever isto fora da classe?
Configuracao c = new Configuracao();

Erro de compilação:
error: Configuracao() has private access in Configuracao

5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
b) Configuracao.getInstancia()
 */

public class Main {
    public static void main(String[] args) {

        /*
        6 - Contador de visitas

        As duas variáveis recebem a mesma instância, então as visitas
        registradas em uma aparecem no total da outra.
         */
        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();

        System.out.println("Total de visitas: " + pagina1.getTotal());

        /*
        7 - Carrinho

        telaProdutos e telaPromocoes também apontam para o mesmo carrinho.
         */
        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
    }
}
