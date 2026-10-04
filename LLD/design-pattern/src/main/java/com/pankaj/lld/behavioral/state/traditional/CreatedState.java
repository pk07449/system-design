package com.pankaj.lld.behavioral.state.traditional;

class CreatedState implements OrderState {

    @Override
    public void handle() {
        System.out.println("Order Created");
    }
}
