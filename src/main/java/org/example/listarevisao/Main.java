package org.example.listarevisao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
         Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
            Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
         */
        System.out.println("Exercicio 1");

        System.out.println("Digite o nome do lanche:");
        String nomeLanche = scanner.nextLine();

        System.out.printf("Digite o valor do lanche %s %n", nomeLanche);
        double valorLanche = scanner.nextDouble();

        if (valorLanche > 30) {
            valorLanche = valorLanche - 5;
        }

        System.out.printf("O lanche %s custa (R$ %.2f)%n%n", nomeLanche, valorLanche);
        scanner.nextLine();

        /*
        2 - Faça um programa que use um laço for para contar de 1 até 15.
        Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
         Imprima na tela o número e a palavra correspondente.
         Exemplo de saída: "1 é Ímpar", "2 é Par"
         */

        System.out.println("Exercicio 2");

        for (int i = 1; i < 16; i++) {

            if (i % 2 == 0) {
                System.out.printf("O número %s é par %n%n", i);
            } else {
                System.out.printf("O número %s é ímpar %n%n", i);
            }
        }

        System.out.println("Exercicio 3");

        /*
        3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha.
        Se digitar uma opção inválida, avise.
        O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
         */

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção: Ver camisas.");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção: Ver calças.");
                    break;
                case 3:
                    System.out.println("Saindo do programa... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }

        } while (opcao != 3);

        scanner.nextLine();

        /*
        4 - Crie uma classe chamada Pet.
        Dê a ela três atributos: nome (String), raca (String) e peso (double).
        Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        Atribua valores para os atributos de cada um deles.
        Imprima os dados dos dois pets concatenando textos e variáveis.
         */

        System.out.println("Exercicio 4");

        Pet galinha = new Pet();
        galinha.nome = "Clotilde";
        galinha.raca = "Caipira";
        galinha.peso = 12.3;

        Pet cavalo = new Pet();
        cavalo.nome = "Pé de pano";
        cavalo.raca = "Pantaneiro";
        cavalo.peso = 380;

        System.out.println("O meu pet é : " + galinha.nome + ", é da raça: " + galinha.raca + " e pesa: " + galinha.peso );
        System.out.println("O meu pet é : " + cavalo.nome + ", é da raça: " + cavalo.raca + " e pesa: " + cavalo.peso );
        System.out.println();

        /*
        5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
            Na classe principal, faça um laço for que repita 3 vezes.
            A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
            Instancie um novo Produto e guarde nele os valores digitados.
            Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
         */

        System.out.println("Exercicio 5");

        for (int i = 0; i < 3; i++) {
            Produto mercadoria = new Produto();

            System.out.println("Qual o nome do produto?");
            mercadoria.nome = scanner.nextLine();

            System.out.println("Qual o valor dele?");
            mercadoria.preco = scanner.nextDouble();

            if (mercadoria.preco > 100) {
                System.out.printf("Produto caro! Nome: (%s), (R$ %.2f)%n%n", mercadoria.nome, mercadoria.preco);
            } else {
                System.out.printf("Produto com preço acessível! Nome: (%s), (R$ %.2f)%n%n", mercadoria.nome,
                        mercadoria.preco);
            }
            scanner.nextLine();
        }

        /*
        6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
        Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
        Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
        Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
         */

        System.out.println("Exercicio 6");

        System.out.println("Olá novo usuário, digite o seu ano de nacimento no seguinte formato (YYYY):");
        int anoUsuario = scanner.nextInt();
        System.out.println("Ótimo! Me diga agora seu nome completo: ");
        String nomeUsuario = scanner.nextLine();
        scanner.nextLine();

        System.out.println("O usuário " + nomeUsuario + " nasceu em " + anoUsuario);


        scanner.close();
    }
}
