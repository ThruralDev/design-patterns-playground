package com.example.designpatterns.behavioral.observer.newsletter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<Observer>> observers = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.observers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Observer listener) {
        List<Observer> users = observers.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Observer listener) {
        List<Observer> users = observers.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType) {
        List<Observer> users = observers.get(eventType);
        for (Observer observer : users) {
            observer.update();
        }
    }
}