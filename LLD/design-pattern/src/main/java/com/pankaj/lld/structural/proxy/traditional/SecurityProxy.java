package com.pankaj.lld.structural.proxy.traditional;

class SecurityProxy
        implements ReportService {

    private ReportService service;

    public SecurityProxy(
            ReportService service) {
        this.service = service;
    }

    public String generate() {

        boolean authorized = true;

        if (!authorized)
            return "Access Denied";

        return service.generate();
    }
}
