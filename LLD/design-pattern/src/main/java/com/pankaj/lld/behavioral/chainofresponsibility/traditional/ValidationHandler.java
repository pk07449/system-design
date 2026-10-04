package com.pankaj.lld.behavioral.chainofresponsibility.traditional;

class ValidationHandler extends Handler {

    @Override
    public void handle(String request) {

        System.out.println("Validating");

        if (next != null) {
            next.handle(request);
        }
    }
}
