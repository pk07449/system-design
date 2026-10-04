package com.pankaj.lld.behavioral.observer.traditional;

class SmsService implements Observer {

    @Override
    public void update(String event) {
        System.out.println("SMS sent: " + event);
    }
}
