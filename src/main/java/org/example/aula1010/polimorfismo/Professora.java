package org.example.aula1010.polimorfismo;

public class Professora extends Pessoa {
    public String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }

    @Override
    public void apresentar() {
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }

    /*
    A armadilha (ex7): apresentar(String cargo) NÃO sobrescreve o apresentar()
    da Pessoa, porque a assinatura é outra (tem parâmetro a mais).
    Isso é uma SOBRECARGA (overload), não um override.

    - Chamando flora.apresentar()       -> imprime a versão de cima (com @Override)
    - Chamando flora.apresentar("prof") -> imprime "Oi, sou Flora, prof"

    Se você pusesse @Override neste método com parâmetro, o Java NÃO compila:
    "@Override does not override a method from a superclass",
    porque não existe apresentar(String) na Pessoa para sobrescrever.
     */
    public void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}
