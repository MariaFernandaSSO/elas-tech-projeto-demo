package org.example.aula0710.colecoes.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAtv {
    public static void main(String[] args) {

        // 1 - Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.
        System.out.println("Ex1 - Fila com add");

        Deque<String> fila = new ArrayDeque<>();
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carla");

        System.out.println("Fila: " + fila);
        System.out.println("Pessoas na fila: " + fila.size());
        System.out.println();

        // 2 - Crie uma fila com addAll. Use peek para mostrar quem é o próximo e imprima a fila logo depois. Repare que ela não mudou.
        System.out.println("Ex2 - Fila com addAll e peek");

        Deque<String> fila2 = new ArrayDeque<>();
        fila2.addAll(java.util.List.of("Diego", "Elisa", "Fábio"));

        String proximo = fila2.peek();
        System.out.println("Próximo: " + proximo);
        System.out.println("Fila depois do peek: " + fila2);
        System.out.println();

        // 3 - Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois. Compare com o exercício 2.
        System.out.println("Ex3 - Fila com poll");

        String atendido = fila2.poll();
        System.out.println("Atendido: " + atendido);
        System.out.println("Fila depois do poll: " + fila2);
        System.out.println();

        // 4 - Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()). No final, imprima "Fila vazia!".
        System.out.println("Ex4 - Atendendo todos com while");

        Deque<String> fila3 = new ArrayDeque<>();
        fila3.add("Gabriel");
        fila3.add("Helena");
        fila3.add("Igor");

        while (!fila3.isEmpty()) {
            String pessoa = fila3.poll();
            System.out.println("Atendendo: " + pessoa);
        }
        System.out.println("Fila vazia!");
        System.out.println();

        // 5 - Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.
        System.out.println("Ex5 - Fila com contains");

        Deque<String> fila4 = new ArrayDeque<>();
        fila4.add("Bia");
        fila4.add("Carla");
        fila4.add("Duda");

        System.out.println("Bia está na fila? " + fila4.contains("Bia"));
        System.out.println("Zoe está na fila? " + fila4.contains("Zoe"));
        System.out.println();

        // 6 - Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        // se estiver vazia -> "Não tem ninguém na fila."; se tiver gente -> "Próximo: [nome]"
        // Depois adicione uma pessoa e teste de novo.
        System.out.println("Ex6 - Fila vazia com isEmpty antes do peek");

        Deque<String> fila5 = new ArrayDeque<>();

        if (fila5.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila5.peek());
        }

        fila5.add("Juliana");

        if (fila5.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila5.peek());
        }
    }
}
