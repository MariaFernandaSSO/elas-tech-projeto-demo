package org.example.aula1010.polimorfismo;

public class Painel {

    // Mesma classe, muda o TIPO do parâmetro
    public void exibir(String texto) {
        System.out.println("Exibindo texto (String): " + texto);
    }

    public void exibir(int numero) {
        System.out.println("Exibindo numero (int): " + numero);
    }

    public void exibir(boolean flag) {
        System.out.println("Exibindo logico (boolean): " + flag);
    }

    public void exibir(double valor) {
        System.out.println("Exibindo decimal (double): " + valor);
    }
}
