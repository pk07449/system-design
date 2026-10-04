package com.pankaj.lld.creational.singleton.functional;

import java.util.Map;

public class ConfigModule {

    static final Map<String, String> config =
            Map.of("url", "localhost");
}