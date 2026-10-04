package com.pankaj.lld.behavioral.strategy.traditional;

public class Test {

    public static void main(String[] args) {

        PaymentService service =
                new PaymentService(new CreditCardPayment());

        service.process(5000);
    }
}