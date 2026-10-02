package org.example.listarevisaodesafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 2) {
            System.out.println("Deseja iniciar? Pressione 1 para continuar, 2 para sair");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();
                    do {
                        System.out.println("Nota 1:");
                        aluna.nota = sc.nextDouble();
                        if (aluna.nota < 0 || aluna.nota > 10) {
                            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        }
                    } while (aluna.nota < 0 || aluna.nota > 10);

                    do {
                        System.out.println("Nota 2:");
                        aluna.nota2 = sc.nextDouble();
                        if (aluna.nota2 < 0 || aluna.nota2 > 10) {
                            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        }
                    } while (aluna.nota2 < 0 || aluna.nota2 > 10);

                    sc.nextLine();

                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();


                    aluna.media = (aluna.nota + aluna.nota2) / 2.0;

                    if (aluna.media >= 6.0) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f,%ne sua média final foi %.1f. Aluna aprovada: %b%n",
                            aluna.nome, aluna.nota, aluna.nota2, aluna.media, aluna.passou);
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }
}
