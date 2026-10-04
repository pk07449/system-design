package com.pankaj.lld.structural.decorator.functional;

import java.util.function.Function;

public class Test {
    static void main() {
        Function<String, String> service =
                msg -> "Sending: " + msg;

        Function<Function<String,String>,
                Function<String,String>> loggingDecorator =
                fn -> msg -> {
                    System.out.println("Before");
                    String result = fn.apply(msg);
                    System.out.println("After");
                    return result;
                };

        Function<String,String> decorated =
                loggingDecorator.apply(service);

        System.out.println(
                decorated.apply("Order Created"));
    }
}
