package com.pankaj.lld.behavioral.template.traditional;

abstract class TransactionProcessor {

    public final void processTransaction() {

        startTransaction();

        doProcess();

        commitTransaction();
    }

    private void startTransaction() {
        System.out.println("Transaction Started");
    }

    abstract void doProcess();

    private void commitTransaction() {
        System.out.println("Transaction Committed");
    }
}
