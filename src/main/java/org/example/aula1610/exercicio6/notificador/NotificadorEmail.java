package org.example.aula1610.exercicio6.notificador;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando por email! -> " + mensagem);
    }
}
