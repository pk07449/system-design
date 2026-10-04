package com.pankaj.lld.structural.decorator.tradiotanal;

public class Test {
    static void main() {
        Notification notification =
                new LoggingDecorator(
                        new EmailNotification());

        notification.send("Order Created");
    }
}
