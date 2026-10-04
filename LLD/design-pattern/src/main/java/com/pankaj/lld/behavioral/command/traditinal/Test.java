package com.pankaj.lld.behavioral.command.traditinal;

public class Test {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        invoker.run(new SaveCommand());
        invoker.run(new EmailCommand());
    }
}