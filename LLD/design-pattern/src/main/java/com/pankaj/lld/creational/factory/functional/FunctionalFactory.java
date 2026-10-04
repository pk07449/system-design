package com.pankaj.lld.creational.factory.functional;

import java.util.Map;
import java.util.function.Consumer;

public class FunctionalFactory {

    static Map<String, Consumer<String>> notifier =
            Map.of(
                "EMAIL", msg -> System.out.println("Email: " + msg),
                "SMS", msg -> System.out.println("SMS: " + msg)
            );

    public static void main(String[] args) {
        notifier.get("EMAIL").accept("Hello");
    }
}