package org.example.aula2610.observer;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private final List<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo observador) {
        observadores.add(observador);
    }

    public void mudarStatus(String status) {
        for (ObservadorVoo observador : observadores) {
            observador.atualizar(status);
        }
    }
}
