package org.example.exemplo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cozinheiro cozinheiro1 = new Cozinheiro();

        System.out.println("Qual o nome do cozinheiro?");

        cozinheiro1.nome = sc.nextLine();
        sc.nextLine();


        System.out.println("Qual a idade do cozinheiro?");
        cozinheiro1.idade = sc.nextInt();
        sc.nextLine();


        System.out.println("Qual o salario do cozinheiro?");
        cozinheiro1.salario = sc.nextDouble();
        sc.nextLine();


        System.out.println("O cozinheiro tem certificação? ");
        cozinheiro1.temCertificacao = sc.nextBoolean();
        sc.nextLine();

        // %s -> string, %d int, %f decimal (double), %b boolean

        System.out.printf("O nome do cozinheiro é %s, tem %d anos, ganha %.2f e possui certificação? %b",
                cozinheiro1.nome, cozinheiro1.idade, cozinheiro1.salario, cozinheiro1.temCertificacao);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

       sc.close();
    }

}
