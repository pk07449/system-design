package com.pankaj.lld.creational.builder.traditinal;

public class Test {
    static void main() {
        User user = new UserBuilder()
                .name("Pankaj")
                .age(30)
                .city("Pune")
                .build();

        System.out.println(user);
    }
}
