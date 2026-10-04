package com.pankaj.lld.behavioral.chainofresponsibility.traditional;

class AuthenticationHandler extends Handler {

    @Override
    public void handle(String request) {

        System.out.println("Authenticating");

        if (next != null) {
            next.handle(request);
        }
    }
}
