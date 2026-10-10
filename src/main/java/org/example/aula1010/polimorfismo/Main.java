package org.example.aula1010.polimorfismo;

public class Main {

    /*
    5 - Crie um método na sua classe Main:
    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
    O método não sabe quem vai receber, e funciona pros três.
     */
    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    public static void main(String[] args) {

        /*
        1 - (mesma classe — muda a QUANTIDADE de parâmetros)
        Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
        - recebe um double (lado do quadrado)  -> lado * lado
        - recebe dois double (base e altura)   -> base * altura
        - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
        Chame os três na Main e imprima os resultados.
         */
        System.out.println("Ex1 - Sobrecarga por QUANTIDADE de parametros");

        Calculadora calc = new Calculadora();

        System.out.println("Quadrado (lado 5): " + calc.calcularArea(5.0));
        System.out.println("Retangulo (base 4, altura 3): " + calc.calcularArea(4.0, 3.0));
        System.out.println("Circulo (raio 2): " + calc.calcularArea(2));
        System.out.println();

        /*
        2 - (mesma classe — muda o TIPO do parâmetro)
        Crie a classe Painel com QUATRO métodos chamados exibir, cada um
        recebendo um tipo diferente: String, int, boolean e double.
        Cada um imprime de um jeito, dizendo que tipo recebeu. Chame os quatro.

        Depois pense: por que o System.out.println() aceita texto, número,
        boolean e objeto, ao invés de ter um método println para cada?
        É exatamente isso que vocês acabaram de fazer.
         */
        System.out.println("Ex2 - Sobrecarga por TIPO do parametro");

        Painel painel = new Painel();

        painel.exibir("Olá");
        painel.exibir(42);
        painel.exibir(true);
        painel.exibir(3.14);
        System.out.println();

        /*
        3 - Crie a classe Professora, também filha de Pessoa, com o atributo
        disciplina e o método lancarNota(String aluna, double nota).

        Na Main, crie uma aluna e uma professora e dê valor aos atributos
        de cada objeto:

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Faça o mesmo com a aluna e chame os métodos das duas.
         */
        System.out.println("Ex3 - Aluna e Professora");

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 20;
        ana.curso = "Java e IA";

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        ana.estudar();
        flora.lancarNota("Ana", 9.5);
        System.out.println();

        /*
        4 - (herança — quem não sobrescreve)
        Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
        o apresentar() e não acrescenta nada.

        Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
        variável do tipo da mãe e chame o método apresentar().

        O que saiu? Por quê? Saiu a versão da Pessoa, porque a Estagiaria
        não sobrescreveu: ela herdou o apresentar() da mãe.
         */
        System.out.println("Ex4 - Estagiaria guardada numa variavel do tipo Pessoa");

        Estagiaria lia = new Estagiaria();
        lia.nome = "Lia";
        lia.idade = 19;

        Pessoa pessoaDaLia = lia;
        pessoaDaLia.apresentar();
        System.out.println();

        /*
        5 - (herança — método que recebe a mãe)
        O método mostrarFicha(Pessoa p) não sabe quem vai receber,
        e funciona pra aluna, pra professora e pra estagiária.
         */
        System.out.println("Ex5 - mostrarFicha com os tres tipos");

        mostrarFicha(ana);
        mostrarFicha(flora);
        mostrarFicha(lia);
        System.out.println();

        /*
        6 - (interface)
        Crie a interface MeioDePagamento com pagar(double valor).
        Crie Pix e Boleto implementando ela, cada uma imprimindo uma
        mensagem diferente com printf e %.2f.

        Declare UMA variável do tipo da interface:

        MeioDePagamento forma;
        forma = new Pix();     forma.pagar(150.00);
        forma = new Boleto();  forma.pagar(150.00);
         */
        System.out.println("Ex6 - Uma variavel da interface, dois objetos");

        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(150.00);
        forma = new Boleto();
        forma.pagar(150.00);
        System.out.println();

        /*
        7 - (a armadilha)
        Na Professora, troque o apresentar() sobrescrito por este,
        com um parâmetro a mais e SEM o @Override:

        void apresentar(String cargo) {
            System.out.println("Oi, sou " + nome + ", " + cargo);
        }

        Rode o exercício 3 de novo. O que a professora imprime agora?
        Deu algum erro? Nenhum erro: apresentar(String) é uma sobrecarga,
        e o apresentar() sem parâmetro continua sendo o da Pessoa.

        Depois coloque o @Override nesse método e veja o que o Java diz:
        erro de compilacao, porque nao existe apresentar(String) na Pessoa.

        Essa questão mostra por que o @Override existe: ele te obriga a
        perceber que voce NAO esta sobrescrevendo nada.
         */
        System.out.println("Ex7 - A armadilha do @Override");

        // Com o @Override no apresentar() correto, imprime a versao da Professora:
        flora.apresentar();

        // O apresentar(String) e uma sobrecarga, nao um override:
        flora.apresentar("professora");
    }
}
