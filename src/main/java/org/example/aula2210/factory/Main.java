package org.example.aula2210.factory;

/*
ATIVIDADE - Factory (22/10)

Questão 1.
O Factory resolve o problema de deixar a criação dos objetos espalhada pelo
programa. Se os ifs que decidem qual objeto criar ficassem no main e em outras
partes, cada lugar precisaria conhecer todas as classes concretas. Ao surgir um
tipo novo, seria necessário alterar todos esses lugares, com risco de esquecer
algum, repetir código e quebrar o funcionamento do programa. Com a fábrica, a
decisão de qual objeto criar fica centralizada em um único ponto.

Questão 2.
Alternativa b) O tipo da interface (ex.: Animal). Assim, quem usa a fábrica
trabalha com a abstração e não fica preso às classes concretas.
 */

public class Main {
    public static void main(String[] args) {
        AnimalFactory fabrica = new AnimalFactory();

        Animal cachorro = fabrica.getAnimal("cachorro");
        Animal gato = fabrica.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
