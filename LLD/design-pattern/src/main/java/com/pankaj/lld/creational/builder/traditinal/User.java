package com.pankaj.lld.creational.builder.traditinal;

public class User {
    // Final fields ensure immutability once built
    private final String name;
    private final int age;
    private final String city;

    // Private constructor so objects can only be created via the Builder
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", city='" + city + "'}";
    }

    // Static inner Builder class

}
