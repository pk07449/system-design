package com.pankaj.lld.structural.composite.traditional;

public class Test {
    static void main() {
        Manager manager = new Manager();

        manager.add(new Developer("John"));
        manager.add(new Developer("Alex"));

        manager.showDetails();
    }
}
