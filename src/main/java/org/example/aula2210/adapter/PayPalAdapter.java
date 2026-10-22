package org.example.aula2210.adapter;

public class PayPalAdapter implements Pagamento {
    private final PayPalAPI payPalAPI = new PayPalAPI();

    @Override
    public void pagar() {
        payPalAPI.sendPayment();
    }
}
