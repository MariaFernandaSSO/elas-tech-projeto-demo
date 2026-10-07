package org.example.aula0710.listarevisao0710;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DesafioCatalogo {

    static String definirClassificacao(double nota) {
        if (nota >= 8) {
            return "Ótimo";
        } else if (nota >= 5) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Filme[] filmes = new Filme[5];
        int total = 0;
        int opcao = 0;

        System.out.println("=== MEU CATÁLOGO ===");

        while (opcao != 5) {
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Buscar por título");
            System.out.println("4 - Estatísticas");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
                continue;
            }
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (total >= filmes.length) {
                        System.out.println("Não é possível cadastrar mais filmes. O catálogo está cheio.");
                        break;
                    }

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Gênero: ");
                    String genero = sc.nextLine().toUpperCase();

                    double nota = -1;
                    boolean notaValida = false;
                    while (!notaValida) {
                        System.out.print("Nota (0 a 10): ");
                        try {
                            nota = sc.nextDouble();
                            sc.nextLine();
                            if (nota >= 0 && nota <= 10) {
                                notaValida = true;
                            } else {
                                System.out.println("Digite uma nota entre 0 e 10.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Digite apenas números!");
                            sc.nextLine();
                        }
                    }

                    Filme novo = new Filme();
                    novo.titulo = titulo;
                    novo.genero = genero;
                    novo.nota = nota;
                    novo.classificacao = definirClassificacao(nota);

                    filmes[total] = novo;
                    total++;

                    System.out.println("Filme cadastrado!");
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("Nenhum filme cadastrado.");
                        break;
                    }

                    System.out.println("--- FILMES CADASTRADOS ---");
                    for (int i = 0; i < total; i++) {
                        System.out.printf("%s [%s] - Nota %.1f - %s%n",
                                filmes[i].titulo, filmes[i].genero, filmes[i].nota, filmes[i].classificacao);
                    }
                    break;

                case 3:
                    if (total == 0) {
                        System.out.println("Nenhum filme cadastrado.");
                        break;
                    }

                    System.out.print("Digite o título: ");
                    String tituloBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < total; i++) {
                        if (filmes[i].titulo.equalsIgnoreCase(tituloBusca)) {
                            System.out.printf("%s [%s] - Nota %.1f - %s%n",
                                    filmes[i].titulo, filmes[i].genero, filmes[i].nota, filmes[i].classificacao);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Filme não encontrado.");
                    }
                    break;

                case 4:
                    if (total == 0) {
                        System.out.println("Nenhum filme cadastrado.");
                        break;
                    }

                    double somaNotas = 0;
                    int melhorIndice = 0;
                    int quantidadeOtimo = 0;

                    for (int i = 0; i < total; i++) {
                        somaNotas += filmes[i].nota;
                        if (filmes[i].nota > filmes[melhorIndice].nota) {
                            melhorIndice = i;
                        }
                        if (filmes[i].classificacao.equals("Ótimo")) {
                            quantidadeOtimo++;
                        }
                    }

                    double mediaNotas = somaNotas / total;

                    System.out.println("Total de filmes: " + total);
                    System.out.printf("Média das notas: %.2f%n", mediaNotas);
                    System.out.println("Melhor filme: " + filmes[melhorIndice].titulo);
                    System.out.println("Filmes ótimos: " + quantidadeOtimo + " de " + total);
                    break;

                case 5:
                    System.out.println("Obrigado por usar o catálogo. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            if (opcao != 5) {
                System.out.println();
            }
        }

        sc.close();
    }
}
