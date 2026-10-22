package org.example.aula2210.factory;

public class AnimalFactory {
    public Animal getAnimal(String tipo) {
        if ("cachorro".equalsIgnoreCase(tipo)) {
            return new Cachorro();
        }

        if ("gato".equalsIgnoreCase(tipo)) {
            return new Gato();
        }

        throw new IllegalArgumentException("Tipo de animal desconhecido: " + tipo);
    }
}
