package com.pankaj.lld.behavioral.template.traditional;

class PaymentProcessor
        extends TransactionProcessor {

    @Override
    void doProcess() {
        System.out.println("Processing Payment");
    }
}
