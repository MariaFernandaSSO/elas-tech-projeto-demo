package org.example.aula2210.facade;

public class ManhaFacade {
    private final Despertador despertador = new Despertador();
    private final Cafeteira cafeteira = new Cafeteira();
    private final Chuveiro chuveiro = new Chuveiro();

    public void acordar() {
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
