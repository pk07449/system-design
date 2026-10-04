package com.pankaj.lld.creational.builder.traditinal;

public  class UserBuilder {
        private String name;
        private int age;
        private String city;

        public UserBuilder name(String name) {
            this.name = name;
            return this; // Returns the builder instance to allow chaining
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        // The build method that instantiates the User object
        public User build() {
            return new User(this);
        }
    }