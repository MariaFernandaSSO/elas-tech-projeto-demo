package org.example.aula2610.observer;

public class Passageiro implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: " + status);
    }
}
