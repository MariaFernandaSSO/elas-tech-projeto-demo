package org.example.aula2610.observer;

public class PainelAeroporto implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }
}
