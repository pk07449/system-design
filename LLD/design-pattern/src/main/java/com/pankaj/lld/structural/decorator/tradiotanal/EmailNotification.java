package com.pankaj.lld.structural.decorator.tradiotanal;

class EmailNotification implements Notification {

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
}
