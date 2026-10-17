package org.example.aula1610.exercicio6.notificador;

public class NotificadorSms implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando por SMS! -> " + mensagem);
    }
}
