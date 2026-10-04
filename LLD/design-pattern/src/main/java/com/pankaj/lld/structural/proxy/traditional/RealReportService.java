package com.pankaj.lld.structural.proxy.traditional;

class RealReportService
        implements ReportService {

    public String generate() {
        return "Financial Report";
    }
}
