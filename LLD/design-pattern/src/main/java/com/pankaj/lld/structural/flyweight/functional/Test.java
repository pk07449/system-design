package com.pankaj.lld.structural.flyweight.functional;

import java.util.Map;

public class Test {
    static void main() {
        Map<String,String> config =
                Map.of(
                        "db.url","localhost",
                        "db.user","admin"
                );

        String url1 = config.get("db.url");
        String url2 = config.get("db.url");

        System.out.println(url1 == url2);
    }
}
