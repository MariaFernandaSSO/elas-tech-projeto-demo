package org.example.aula1010.heranca;

public class Main {
    public static void main(String[] args) {

        /*
        1 - Crie a classe Pessoa com os atributos nome e idade, e o método
        apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."

        Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.

        Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

        Repare: você não escreveu nome, idade nem apresentar() na Aluna,
        e os três funcionaram.
         */
        System.out.println("Ex1 - Aluna usando tudo que vem da Pessoa");

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 20;
        ana.apresentar();
        System.out.println();

        /*
        2 - Acrescente na Aluna o atributo curso e o método estudar(), que
        imprime "[nome] está estudando [curso]."

        Preencha os três atributos no objeto e chame os dois métodos.

        Repare que o estudar() usa o nome, que veio da mãe.
         */
        System.out.println("Ex2 - Aluna com curso e estudar()");

        Aluna ana2 = new Aluna();
        ana2.nome = "Ana";
        ana2.idade = 20;
        ana2.curso = "Java e IA";
        ana2.apresentar();
        ana2.estudar();
        System.out.println();

        /*
        3 - Crie a classe Professora, também filha de Pessoa, com o atributo
        disciplina e o método lancarNota(String aluna, double nota), que
        imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
        com %.1f.

        Na Main, crie uma aluna e uma professora, preencha os atributos de
        cada objeto e chame os métodos das duas.
         */
        System.out.println("Ex3 - Aluna e Professora");

        Aluna ana3 = new Aluna();
        ana3.nome = "Ana";
        ana3.idade = 20;
        ana3.curso = "Java e IA";

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        ana3.estudar();
        flora.lancarNota("Ana", 9.5);
        System.out.println();

        /*
        4 - Na Professora, sobrescreva o apresentar() usando @Override, pra
        imprimir "Oi, sou [nome] e ensino [disciplina]."

        Chame apresentar() na aluna e na professora e compare as saídas.
         */
        System.out.println("Ex4 - apresentar() da aluna vs apresentar() da professora");

        ana3.apresentar();
        flora.apresentar();
        System.out.println();

        /*
        5 - Faça uma cadeia de três níveis:
        - Funcionario, com o atributo nome e o método baterPonto()
        - Gerente extends Funcionario, com aprovarFerias(String quem)
        - Diretora extends Gerente, com definirMeta(String meta)

        Na Main, crie uma Diretora, preencha o nome dela
        (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.

        Herança em cadeia: ela tem tudo que vem de cima.
         */
        System.out.println("Ex5 - Heranca em cadeia");

        Diretora carla = new Diretora();
        carla.nome = "Carla";

        carla.baterPonto();
        carla.aprovarFerias("Ana");
        carla.definirMeta("Crescer 20% no semestre");
        System.out.println();

        /*
        6 - Crie duas interfaces:
        - Notificavel, com notificar(String mensagem)
        - Exportavel, com exportar()

        Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
        extends Funcionario:

        class Gerente extends Funcionario implements Notificavel, Exportavel

        Na Main, crie um gerente, preencha o nome e chame os quatro
        métodos nele: baterPonto(), aprovarFerias(), notificar()
        e exportar().

        UMA herança (extends), VÁRIAS interfaces (implements).
        Depois tente colocar uma segunda classe no extends:
        extends Funcionario, Pessoa
        Veja o que o Java responde.
         */
        System.out.println("Ex6 - Gerente com heranca + interfaces");

        Gerente paulo = new Gerente();
        paulo.nome = "Paulo";

        paulo.baterPonto();
        paulo.aprovarFerias("Beatriz");
        paulo.notificar("Reunião às 14h");
        paulo.exportar();
        System.out.println();

        // O Java NÃO deixa: class Gerente extends Funcionario, Pessoa
        // Erro de compilacao: "class cannot extend multiple classes"
        // Uma unica heranca de classe (extends), varias interfaces (implements).
    }
}
