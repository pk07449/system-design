package com.pankaj.lld.behavioral.state.traditional;

class PaidState implements OrderState {

    @Override
    public void handle() {
        System.out.println("Payment Done");
    }
}
