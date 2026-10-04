package com.pankaj.lld.structural.adaptor.traditional;

class PaymentAdapter implements PaymentProcessor {

    private LegacyGateway gateway;

    public PaymentAdapter(LegacyGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public String pay(double amount) {
        return gateway.makePayment((int) amount);
    }
}
