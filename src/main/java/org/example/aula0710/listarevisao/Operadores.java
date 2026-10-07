package org.example.aula0710.listarevisao;

public class Operadores {
    public static void main(String[] args) {

        // 1 - Crie a = 15 e b = 4. Imprima a soma, a subtraÃ§Ã£o, a multiplicaÃ§Ã£o, a divisÃ£o e o resto.
        System.out.println("Ex1 - OperaÃ§Ãµes com a = 15 e b = 4");

        int a = 15;
        int b = 4;

        System.out.println("Soma: " + (a + b));
        System.out.println("SubtraÃ§Ã£o: " + (a - b));
        System.out.println("MultiplicaÃ§Ã£o: " + (a * b));
        System.out.println("DivisÃ£o: " + ((double) a / b));
        System.out.println("Resto: " + (a % b));
        System.out.println();

        // 2 - Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.
        System.out.println("Ex2 - Saldo com operadores compostos");

        double saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println("Saldo final: " + saldo);
        System.out.println();

        // 3 - Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.
        System.out.println("Ex3 - Operadores de comparaÃ§Ã£o");

        int a2 = 10;
        int b2 = 10;

        System.out.println("a == b: " + (a2 == b2));
        System.out.println("a != b: " + (a2 != b2));
        System.out.println("a > b: " + (a2 > b2));
        System.out.println("a >= b: " + (a2 >= b2));
        System.out.println();

        // 4 - Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.
        System.out.println("Ex4 - Operador lÃ³gico AND");

        int idade = 20;
        boolean temCarteira = true;
        System.out.println(idade >= 18 && temCarteira);
        System.out.println();

        // 5 - Crie um nÃºmero e imprima o resto da divisÃ£o dele por 2.
        System.out.println("Ex5 - Resto da divisÃ£o por 2");

        int numero = 7;
        System.out.println("Resto de " + numero + " por 2: " + (numero % 2));
        System.out.println();

        // 6 - Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
        System.out.println("Ex6 - Total da compra");

        double precoArroz = 5.50;
        int quantidade = 3;
        double totalCompra = precoArroz * quantidade;
        System.out.println("Total da compra: R$ " + totalCompra);
        System.out.println();

        // Mini-desafio - Crie uma variÃ¡vel com um nÃºmero qualquer e, sem usar if, imprima true ou false
        // para a pergunta: esse nÃºmero Ã© divisÃ­vel por 3 e por 5 ao mesmo tempo?
        // Dica: um nÃºmero Ã© divisÃ­vel por outro quando o resto da divisÃ£o Ã© zero.
        System.out.println("Mini-desafio - DivisÃ­vel por 3 e por 5 ao mesmo tempo");

        int numeroQualquer = 15;
        boolean divisivelPor3E5 = (numeroQualquer % 3 == 0) && (numeroQualquer % 5 == 0);
        System.out.println(divisivelPor3E5);
    }
}
