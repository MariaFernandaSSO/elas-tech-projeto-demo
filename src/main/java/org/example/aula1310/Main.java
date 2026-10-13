package org.example.aula1310;

public class Main {
    public static void main(String[] args) {

        /*
        1 - Sentir o private na pele

        As duas linhas abaixo não compilam:
        System.out.println(c.titular);
        c.saldo = -5000;

        Erros esperados:
        error: titular has private access in ContaBancaria
        error: saldo has private access in ContaBancaria
         */
        ContaBancaria c = new ContaBancaria();
        // System.out.println(c.titular);
        // c.saldo = -5000;

        /*
        2 - Abrir a porta de leitura

        O objeto existe, mas está vazio: null e 0.0 são os valores
        que o Java coloca sozinho quando usamos new.
         */
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());

        /*
        3 - A porta de escrita, com porteiro

        O setter recusa valor vazio e mantém o que já estava.
         */
        c.setTitular("");
        System.out.println("Titular: " + c.getTitular());

        c.setTitular("Ana");
        System.out.println("Titular: " + c.getTitular());

        /*
        4 - Métodos que fazem o trabalho sujo

        Quem usa a classe vê só depositar() e sacar().
         */
        c.depositar(500);
        System.out.println("Saldo: " + c.getSaldo());

        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);
        System.out.println("Saldo: " + c.getSaldo());

        // Não compila:
        // c.registrarLog("teste");
        // error: registrarLog(String) has private access in ContaBancaria

        /*
        5 - Os modificadores lado a lado

        No mesmo package, default e public se comportam igual.
        O private só pode ser lido dentro da própria classe.
         */
        Produto produto = new Produto();
        System.out.println(produto.nome);
        System.out.println(produto.preco);

        // Não compila:
        // System.out.println(produto.codigoInterno);
        // error: codigoInterno has private access in Produto

        /*
        6 - Nem todo atributo precisa de setter

        O número da conta pode ser lido, mas não alterado.
         */
        System.out.println("Numero da conta: " + c.getNumeroConta());

        // Não compila:
        // c.setNumeroConta("999-Z");
        // error: cannot find symbol
        //   symbol:   method setNumeroConta(String)
    }
}
