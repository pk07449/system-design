package com.pankaj.lld.structural.adaptor.functional;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, String> legacyGateway =
                amount -> "Paid Rs." + amount;

        Function<Double, String> adapter =
                amount -> legacyGateway.apply(amount.intValue());

        System.out.println(adapter.apply(100.50));
    }
}
