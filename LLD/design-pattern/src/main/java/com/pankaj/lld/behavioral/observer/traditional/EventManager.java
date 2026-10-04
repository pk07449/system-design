package com.pankaj.lld.behavioral.observer.traditional;

import java.util.ArrayList;
import java.util.List;

class EventManager {

    private List<Observer> observers =
            new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String event) {

        observers.forEach(o -> o.update(event));
    }
}
