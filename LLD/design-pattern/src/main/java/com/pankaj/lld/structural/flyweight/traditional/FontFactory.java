package com.pankaj.lld.structural.flyweight.traditional;

class FontFactory {

    private static Map<String, Font> cache =
            new HashMap<>();

    public static Font getFont(
            String name) {

        return cache.computeIfAbsent(
                name,
                Font::new
        );
    }
}
