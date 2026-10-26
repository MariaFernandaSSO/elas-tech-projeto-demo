package org.example.aula2210.decorator;

public class Granola extends AcaiDecorator {

    public Granola(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + ", granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 2.00;
    }
}
