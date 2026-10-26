package org.example.aula2210.decorator;

public class Morango extends AcaiDecorator {

    public Morango(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + ", morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 3.50;
    }
}
