package com.pankaj.lld.behavioral.observer.traditional;

class EmailService implements Observer {

    @Override
    public void update(String event) {
        System.out.println("Email sent: " + event);
    }
}
