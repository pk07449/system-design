package com.pankaj.lld.structural.bridge.traditional;

class XmlFormatter
        implements Formatter {

    public String format(String data) {
        return "<data>" + data + "</data>";
    }
}
