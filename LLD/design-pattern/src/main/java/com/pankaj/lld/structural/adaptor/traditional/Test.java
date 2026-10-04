package com.pankaj.lld.structural.adaptor.traditional;

public class Test {
    static void main() {
        PaymentProcessor processor =
                new PaymentAdapter(new LegacyGateway());

        System.out.println(processor.pay(100.50));
    }
}
