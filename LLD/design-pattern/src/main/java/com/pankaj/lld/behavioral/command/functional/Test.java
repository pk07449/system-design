package com.pankaj.lld.behavioral.command.functional;

public class Test {

    public static void execute(Runnable command) {
        command.run();
    }

    public static void main(String[] args) {

        Runnable save =
                () -> System.out.println("Saving Order");

        Runnable email =
                () -> System.out.println("Sending Email");

        execute(save);
        execute(email);
    }
}