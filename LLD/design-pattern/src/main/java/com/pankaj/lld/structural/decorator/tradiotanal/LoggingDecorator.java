package com.pankaj.lld.structural.decorator.tradiotanal;

class LoggingDecorator implements Notification {

    private Notification notification;

    public LoggingDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String msg) {
        System.out.println("Logging Start");
        notification.send(msg);
        System.out.println("Logging End");
    }
}
