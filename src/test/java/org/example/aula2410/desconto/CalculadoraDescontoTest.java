package org.example.aula2410.desconto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraDescontoTest {

    @Test
    void compraMenorQueCemDeClienteComumNaoTemDesconto() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 50.0;

        // Act
        double resultado = calculadora.aplicarDesconto(valorCompra, false);

        // Assert
        assertEquals(50.0, resultado, 0.001);
    }

    @Test
    void clienteVipGanhaDezPorCentoDeDesconto() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 200.0;

        // Act
        double resultado = calculadora.aplicarDesconto(valorCompra, true);

        // Assert
        assertEquals(180.0, resultado, 0.001);
    }

    @Test
    void valorZeroOuNegativoLancaExcecao() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> calculadora.aplicarDesconto(-10.0, false));
    }
}
