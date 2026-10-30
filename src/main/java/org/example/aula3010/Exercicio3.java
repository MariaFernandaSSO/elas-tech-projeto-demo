package org.example.aula3010;

import java.util.Random;
import java.util.function.Supplier;

public class Exercicio3 {

    public static void main(String[] args) {
        Supplier<String> avisoSistema = () -> "Aviso: O sistema está online!";
        System.out.println(avisoSistema.get());

        Supplier<Integer> geradorNumero = () -> new Random().nextInt(100);
        System.out.println("Primeira chamada: " + geradorNumero.get());
        System.out.println("Segunda chamada: " + geradorNumero.get());
    }
}
