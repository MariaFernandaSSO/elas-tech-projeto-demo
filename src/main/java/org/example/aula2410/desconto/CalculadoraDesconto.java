package org.example.aula2410.desconto;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVip) {
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }

        if (clienteVip) {
            return valorCompra * 0.90;
        }

        return valorCompra;
    }
}
