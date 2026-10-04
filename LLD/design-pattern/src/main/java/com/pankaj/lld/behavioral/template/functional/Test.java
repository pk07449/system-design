package com.pankaj.lld.behavioral.template.functional;

public class Test {

    public static void process(
            Runnable start,
            Runnable business,
            Runnable commit) {

        start.run();

        business.run();

        commit.run();
    }

    public static void main(String[] args) {

        process(
                () -> System.out.println("Transaction Started"),

                () -> System.out.println("Payment Processing"),

                () -> System.out.println("Transaction Committed")
        );
    }
}