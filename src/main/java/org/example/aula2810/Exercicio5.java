package org.example.aula2810;

public class Exercicio5 {

    static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    public static void main(String[] args) {

        // 5 - Interface Operacao com int aplicar(int n).
        // Crie um metodo static void mostrarResultado(Operacao op, int valor) que imprime
        // o retorno de op.aplicar(valor).
        // No main, chame mostrarResultado tres vezes com tres lambdas diferentes:
        // dobro, quadrado e negativo.
        // Aqui voce ve lambda com retorno entrando por parametro, as duas coisas juntas.
        System.out.print("Dobro de 5: ");
        mostrarResultado(n -> n * 2, 5);

        System.out.print("Quadrado de 5: ");
        mostrarResultado(n -> n * n, 5);

        System.out.print("Negativo de 5: ");
        mostrarResultado(n -> -n, 5);
    }
}
