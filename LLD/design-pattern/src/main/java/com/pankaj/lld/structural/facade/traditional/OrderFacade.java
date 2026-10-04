package com.pankaj.lld.structural.facade.traditional;

class OrderFacade {

    private Validator validator = new Validator();
    private Enricher enricher = new Enricher();
    private Repository repository = new Repository();

    public String process(String order) {
        return repository.save(
                enricher.enrich(
                        validator.validate(order)
                )
        );
    }
}
