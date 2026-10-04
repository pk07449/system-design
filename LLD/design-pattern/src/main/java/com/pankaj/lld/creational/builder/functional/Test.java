package com.pankaj.lld.creational.builder.functional;

public class Test {
    static void main() {
        User user = new User("",0,"")
                .withName("Pankaj")
                .withAge(30)
                .withCity("Pune");
    }
}
