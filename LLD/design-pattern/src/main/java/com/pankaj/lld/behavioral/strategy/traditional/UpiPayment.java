package com.pankaj.lld.behavioral.strategy.traditional;

class UpiPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}
