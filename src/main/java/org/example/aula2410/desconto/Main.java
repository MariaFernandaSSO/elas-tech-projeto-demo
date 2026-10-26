package org.example.aula2410.desconto;

/*
ATIVIDADE - Testes Unitários com JUnit 5 (24/10)

1. Alternativa B) O teste apita vermelho imediatamente na máquina da programadora
antes de o bug ir para o cliente, evitando a regressão. O teste não conserta nada
por conta própria, ele apenas mostra que algo quebrou.

2. Alternativa C) Porque os testes unitários testam pequenas partes isoladas do
código, rodando em milissegundos e sendo muito mais baratos e fáceis de manter.
Por isso eles são a base da pirâmide (cerca de 70% dos testes).

3. Alternativa B) Na etapa Assert usamos os comandos do JUnit (assertEquals,
assertTrue, assertThrows...) para verificar se o resultado obtido bateu com o
esperado. Arrange prepara, Act executa, Assert confere.

4. Alternativa D) assertThrows(IllegalArgumentException.class, () -> conta.sacar(-50.0));
O assertThrows espera que o código dentro do lambda lance a exceção.

5. Alternativa B) Green é escrever o código mais simples e direto possível para
fazer o teste passar e ficar verde. Red é escrever o teste e vê-lo falhar,
Refactor é limpar o código depois.

6. Por que testar só com System.out.println não funciona quando o projeto cresce?
Porque o teste no olho depende de alguém ficar olhando a tela e lembrar de
rodar o programa inteiro a cada mudança. Não é automático, não avisa quando algo
quebra, não roda sozinho na integração contínua e é lento de repetir. Com
centenas de telas e regras, alguém sempre acaba esquecendo um caso. O teste
unitário roda sozinho, dá erro na hora e cobre o caso para sempre.

Detetive de Código: a anotação esquecida é @Test, que fica em cima do método de
teste. Sem ela o JUnit não sabe qual método é um teste e simplesmente o ignora.

Refatoração sem medo: o Refactor vem depois do Green porque o teste já verde é a
prova de que o código funciona. Refatorar antes disso é mudar o código sem
nenhuma rede de segurança: se der errado, ninguém sabe se o erro é do refactor ou
do código novo. Depois do verde, dá para limpar repetições e aplicar boas
práticas com a certeza de que o comportamento continua o mesmo.
 */

public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        System.out.printf("Compra de R$ 50,00 (cliente comum): R$ %.2f%n",
                calculadora.aplicarDesconto(50.0, false));

        System.out.printf("Compra de R$ 200,00 (cliente VIP): R$ %.2f%n",
                calculadora.aplicarDesconto(200.0, true));

        try {
            calculadora.aplicarDesconto(-10.0, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Compra de R$ -10,00: " + e.getMessage());
        }
    }
}
