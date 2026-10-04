package com.pankaj.lld.creational.builder.functional;

record User(
    String name,
    int age,
    String city
) {

    User withName(String name) {
        return new User(name, age, city);
    }

    User withAge(int age) {
        return new User(name, age, city);
    }

    User withCity(String city) {
        return new User(name, age, city);
    }
}