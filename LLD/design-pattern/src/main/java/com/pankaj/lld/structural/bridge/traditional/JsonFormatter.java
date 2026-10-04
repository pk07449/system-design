package com.pankaj.lld.structural.bridge.traditional;

class JsonFormatter
        implements Formatter {

    public String format(String data) {
        return "{data:" + data + "}";
    }
}
