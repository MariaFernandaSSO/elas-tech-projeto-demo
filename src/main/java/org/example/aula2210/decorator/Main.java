package org.example.aula2210.decorator;

/*
ATIVIDADE - Decorator na Açaiteria (22/10)

Questão 1.
Criar uma classe para cada combinação de adicionais é um problema porque o
número de classes cresce muito: com 4 adicionais já existem 16 combinações
possíveis (2^4), e cada nova classe repete o mesmo código. O Decorator faz o
contrário: existe uma classe só por adicional, e o açaí com adicionais é montado
em tempo de execução, embrulhando um açaí dentro do outro. Assim dá para criar
qualquer combinação nova sem escrever nenhuma classe a mais.

Questão 2.
Alternativa b) Para que um adicional também conte como açaí e possa ir dentro de
outro adicional. Como o AcaiDecorator implementa Acai, qualquer adicional pode
ser usado como base de outro embrulho (granola embrulhada no morango, por
exemplo).
 */

public class Main {
    public static void main(String[] args) {

        // Açaí simples com granola
        Acai acaiComGranola = new Granola(new AcaiSimples());

        System.out.println("Açaí com granola");
        System.out.println(acaiComGranola.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acaiComGranola.getPreco());
        System.out.println();

        // Açaí com granola e morango: o morango embrulha o açaí com granola
        Acai acaiComGranolaEMorango = new Morango(new Granola(new AcaiSimples()));

        System.out.println("Açaí com granola e morango");
        System.out.println(acaiComGranolaEMorango.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acaiComGranolaEMorango.getPreco());
    }
}
