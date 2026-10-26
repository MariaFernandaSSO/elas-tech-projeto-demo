package org.example.aula2210.decorator;

public class LeiteNinho extends AcaiDecorator {

    public LeiteNinho(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + ", leite ninho";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 3.00;
    }
}
