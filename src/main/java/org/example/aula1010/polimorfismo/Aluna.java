package org.example.aula1010.polimorfismo;

public class Aluna extends Pessoa {
    public String curso;

    public void estudar() {
        System.out.println(nome + " está estudando " + curso + ".");
    }
}
