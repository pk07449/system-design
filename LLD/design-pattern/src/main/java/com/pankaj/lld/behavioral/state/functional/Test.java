package com.pankaj.lld.behavioral.state.functional;

import java.util.Map;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        Map<OrderState, Consumer<String>> states =
                Map.of(

                        OrderState.CREATED,
                        order -> System.out.println("Order Created: " + order),

                        OrderState.PAID,
                        order -> System.out.println("Payment Done: " + order)
                );

        states.get(OrderState.PAID)
                .accept("ORD-1001");
    }
}