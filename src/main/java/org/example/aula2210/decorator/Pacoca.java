package org.example.aula2210.decorator;

public class Pacoca extends AcaiDecorator {

    public Pacoca(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + ", paçoca";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 2.50;
    }
}
