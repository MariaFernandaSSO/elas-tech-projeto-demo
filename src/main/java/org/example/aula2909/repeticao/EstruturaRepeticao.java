package org.example.aula2909.repeticao;

public class EstruturaRepeticao {
        public static void main(String[] args) {

            // 1 - Mostre os números de 1 a 30, um por linha, usando for.
            System.out.println("Ex1 - Mostre os números de 1 a 30, um por linha, usando for.");
            for (int i = 1; i <= 30; i++) {
                System.out.println(i);
            }

            // 2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".
            System.out.println("\nEx2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra 'Fim!'");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            System.out.println("Fim!");

            // 3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.
            System.out.println("\nEx3 - Faça o mesmo do exercício 1, agora usando while.");
            int j = 1;
            while (j <= 30) {
                System.out.println(j);
                j++;
            }

            // 4 - Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
            System.out.println("\nEx4 - Crie uma variável com um número e mostre a tabuada dele de 1 a 10.");
            int numero = 7;

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
}
