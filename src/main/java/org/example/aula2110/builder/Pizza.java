package org.example.aula2110.builder;

import lombok.Builder;

@Builder
public class Pizza {
    private boolean temQueijo;
    private String borda;
    private String sabor;


    // Getters e Setters (não precisa, eu fiz por costume)
    public boolean isTemQueijo() {
        return temQueijo;
    }

    public void setTemQueijo(boolean temQueijo) {
        this.temQueijo = temQueijo;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
