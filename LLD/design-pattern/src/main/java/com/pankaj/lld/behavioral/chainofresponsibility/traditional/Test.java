package com.pankaj.lld.behavioral.chainofresponsibility.traditional;

public class Test {

    public static void main(String[] args) {

        Handler validation =
                new ValidationHandler();

        Handler auth =
                new AuthenticationHandler();

        validation.setNext(auth);

        validation.handle("API Request");
    }
}