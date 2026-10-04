package com.pankaj.lld.behavioral.state.traditional;

class OrderContext {

    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle();
    }
}
