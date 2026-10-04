package com.pankaj.lld.creational.factory.traditinal;

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Email sent");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("SMS sent");
    }
}

class NotificationFactory {
    static Notification create(String type) {
        return switch(type) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            default -> throw new IllegalArgumentException();
        };
    }
}