package com.pankaj.lld.structural.composite.functional;

import java.util.List;
import java.util.function.Function;

public class Test {
    static void main() {
        List<Function<String,String>> operations =
                List.of(
                        String::trim,
                        String::toUpperCase,
                        s -> s + "!"
                );

        Function<String,String> composite =
                operations.stream()
                        .reduce(
                                Function.identity(),
                                Function::andThen
                        );

        System.out.println(
                composite.apply(" hello "));
    }
}
