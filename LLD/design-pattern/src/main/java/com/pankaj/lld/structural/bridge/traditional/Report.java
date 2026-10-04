package com.pankaj.lld.structural.bridge.traditional;

class Report {

    private Formatter formatter;

    public Report(
            Formatter formatter) {
        this.formatter = formatter;
    }

    public void generate(String data) {
        System.out.println(
                formatter.format(data));
    }
}
