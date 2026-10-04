package com.pankaj.lld.behavioral.strategy.traditional;

class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}
