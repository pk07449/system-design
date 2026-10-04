package com.pankaj.lld.structural.facade.functional;

import java.util.function.Function;

public class Test {
    static void main() {
        Function<String,String> validate =
                order -> order;

        Function<String,String> enrich =
                order -> order + " Enriched";

        Function<String,String> save =
                order -> "Saved " + order;

        Function<String,String> facade =
                validate
                        .andThen(enrich)
                        .andThen(save);

        System.out.println(
                facade.apply("Order"));
    }
}
