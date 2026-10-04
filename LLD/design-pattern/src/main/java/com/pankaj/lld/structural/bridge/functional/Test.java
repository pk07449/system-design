package com.pankaj.lld.structural.bridge.functional;

import java.util.function.Function;

public class Test {
    static Function<String, String> json =
            s -> "{data:" + s + "}";

    static Function<String, String> xml =
            s -> "<data>" + s + "</data>";

    static void main() {
        process("abc", json);


    }

    static void process(
            String data,
            Function<String, String> formatter) {

        System.out.println(
                formatter.apply(data));
    }
}
