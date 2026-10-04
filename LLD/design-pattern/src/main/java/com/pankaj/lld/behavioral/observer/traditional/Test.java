package com.pankaj.lld.behavioral.observer.traditional;

public class Test {

    public static void main(String[] args) {

        EventManager manager =
                new EventManager();

        manager.subscribe(new EmailService());
        manager.subscribe(new SmsService());

        manager.notifyAllObservers("Order Created");
    }
}