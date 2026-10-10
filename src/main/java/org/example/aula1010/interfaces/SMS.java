package org.example.aula1010.interfaces;

public class SMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
