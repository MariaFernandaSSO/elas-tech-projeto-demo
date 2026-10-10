package org.example.aula1010.polimorfismo;

public class Calculadora {

    // Mesma classe, muda a QUANTIDADE de parâmetros
    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public double calcularArea(int raio) {
        return 3.14159 * raio * raio;
    }
}
