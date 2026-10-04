package com.pankaj.lld.structural.composite.traditional;

class Manager implements Employee {

    private List<Employee> team =
            new ArrayList<>();

    public void add(Employee emp) {
        team.add(emp);
    }

    public void showDetails() {
        team.forEach(Employee::showDetails);
    }
}
