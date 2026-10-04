package com.pankaj.lld.behavioral.strategy.functional;

import java.util.function.Consumer;

public class Test {

    public static void processPayment(
            double amount,
            Consumer<Double> paymentStrategy) {

        paymentStrategy.accept(amount);
    }

    public static void main(String[] args) {

        Consumer<Double> cardPayment =
                amt -> System.out.println("Card Payment: " + amt);

        Consumer<Double> upiPayment =
                amt -> System.out.println("UPI Payment: " + amt);

        processPayment(1000, cardPayment);
        processPayment(2000, upiPayment);
    }
}