package com.pankaj.lld.behavioral.chainofresponsibility.functional;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        Function<String, String> validate =
                req -> {
                    System.out.println("Validating");
                    return req;
                };

        Function<String, String> authenticate =
                req -> {
                    System.out.println("Authenticating");
                    return req;
                };

        Function<String, String> transform =
                req -> {
                    System.out.println("Transforming");
                    return req.toUpperCase();
                };

        Function<String, String> pipeline =
                validate
                        .andThen(authenticate)
                        .andThen(transform);

        System.out.println(
                pipeline.apply("payment request"));
    }
}