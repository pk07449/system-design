package com.pankaj.lld.behavioral.observer.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    private final List<Consumer<String>> listeners =
            new ArrayList<>();

    public void subscribe(Consumer<String> listener) {
        listeners.add(listener);
    }

    public void publish(String event) {

        listeners.forEach(listener ->
                listener.accept(event));
    }

    public static void main(String[] args) {

        Test observer =
                new Test();

        observer.subscribe(
                e -> System.out.println("Email: " + e));

        observer.subscribe(
                e -> System.out.println("SMS: " + e));

        observer.publish("Order Created");
    }
}