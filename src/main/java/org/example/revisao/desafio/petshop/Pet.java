package org.example.revisao.desafio.petshop;

public class Pet {
    public String nome;
    public String especie;
    public double peso;
    public String porte;

    /*
    5. Tirando o porte do main

    Olha o peso do próprio pet e devolve o porte.
    Como está dentro da classe, enxerga os atributos direto: não recebe nada.
     */
    public String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }
}
