package org.example.aula2210.facade;

/*
ATIVIDADE - Facade (22/10)

Questão 7.
O Facade resolve o problema de precisar conversar com várias classes e lembrar
a ordem certa de usar cada uma. É como o síndico do condomínio: em vez de o
morador falar com o eletricista, o encanador e o zelador separadamente, ele
resolve tudo com uma única pessoa. A fachada faz isso com o código: oferece um
método simples que coordena as classes envolvidas por dentro.

Questão 8.
(F) A fachada precisa implementar uma interface.
(V) A fachada guarda as classes envolvidas no processo em atributos.
(F) Depois que a fachada existe, é proibido usar as outras classes diretamente.
A fachada é uma forma mais simples de usar o sistema, mas as classes continuam
disponíveis para quem precisar delas.
 */

public class Main {
    public static void main(String[] args) {
        ManhaFacade manha = new ManhaFacade();
        manha.acordar();
    }
}
