package org.example.aula0710.listarevisao;

public class Metodos {
    public static void main(String[] args) {

        // 1 - Crie um mÃ©todo mostrarBoasVindas() que imprime uma mensagem. Chame no main.
        System.out.println("Ex1 - mostrarBoasVindas()");
        mostrarBoasVindas();
        System.out.println();

        // 2 - Crie saudacao(String nome) que imprime "OlÃ¡, [nome]!". Chame trÃªs vezes com nomes diferentes.
        System.out.println("Ex2 - saudacao(String nome)");
        saudacao("Ana");
        saudacao("Bruno");
        saudacao("Carla");
        System.out.println();

        // 3 - Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.
        System.out.println("Ex3 - dobro(int numero)");
        int resultadoDobro = dobro(5);
        System.out.println("O dobro de 5 Ã©: " + resultadoDobro);
        System.out.println();

        // 4 - Crie calcularMedia(double n1, double n2) que devolve a mÃ©dia. Mostre com duas casas decimais.
        System.out.println("Ex4 - calcularMedia(double n1, double n2)");
        double media = calcularMedia(8.0, 7.0);
        System.out.printf("MÃ©dia: %.2f%n", media);
        System.out.println();

        // 5 - Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.
        System.out.println("Ex5 - ehPar(int numero)");
        if (ehPar(10)) {
            System.out.println("O nÃºmero 10 Ã© par.");
        } else {
            System.out.println("O nÃºmero 10 Ã© Ã­mpar.");
        }
        if (ehPar(7)) {
            System.out.println("O nÃºmero 7 Ã© par.");
        } else {
            System.out.println("O nÃºmero 7 Ã© Ã­mpar.");
        }
        System.out.println();

        // 6 - Crie dois mÃ©todos somar: um que recebe dois nÃºmeros e outro que recebe trÃªs.
        System.out.println("Ex6 - sobrecarga do mÃ©todo somar");
        somar(2, 3);
        somar(2, 3, 4);
        System.out.println();

        // Mini-desafio - Crie um mÃ©todo ehMaiorDeIdade(int idade) que devolve true ou false.
        // Depois crie outro mÃ©todo, liberarEntrada(int idade), que chama o primeiro e imprime
        // se a pessoa pode entrar ou nÃ£o. No main, chame apenas o segundo.
        // Dica: um mÃ©todo pode chamar outro normalmente, basta escrever o nome dele.
        System.out.println("Mini-desafio - liberarEntrada(int idade)");
        liberarEntrada(20);
        liberarEntrada(15);
    }

    static void mostrarBoasVindas() {
        System.out.println("Bem-vindo ao curso de Java!");
    }

    static void saudacao(String nome) {
        System.out.println("OlÃ¡, " + nome + "!");
    }

    static int dobro(int numero) {
        return numero * 2;
    }

    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    static void somar(int n1, int n2) {
        System.out.println("Soma de " + n1 + " e " + n2 + ": " + (n1 + n2));
    }

    static void somar(int n1, int n2, int n3) {
        System.out.println("Soma de " + n1 + ", " + n2 + " e " + n3 + ": " + (n1 + n2 + n3));
    }

    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static void liberarEntrada(int idade) {
        if (ehMaiorDeIdade(idade)) {
            System.out.println("Idade " + idade + ": pode entrar.");
        } else {
            System.out.println("Idade " + idade + ": nÃ£o pode entrar.");
        }
    }
}
