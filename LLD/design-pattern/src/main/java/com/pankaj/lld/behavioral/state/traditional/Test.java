package com.pankaj.lld.behavioral.state.traditional;

public class Test {

    public static void main(String[] args) {

        OrderContext order =
                new OrderContext();

        order.setState(new PaidState());

        order.process();
    }
}