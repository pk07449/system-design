package com.pankaj.lld.structural.proxy.functional;

import java.util.function.Function;

public class Test {
    static void main() {
        Function<String,String> reportService =
                user -> "Financial Report";

        Function<String,String> proxy =
                user -> {
                    if(!"admin".equals(user))
                        return "Access Denied";

                    return reportService.apply(user);
                };

        System.out.println(proxy.apply("admin"));
    }
}
