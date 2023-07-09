package com.example.designpatterns.behavioral.observer.newsletter;

public class StoreObserver implements Observer{

    @Override
    public void update() {
        System.out.println("Observer got mail: We are closed the next days to party hard.");
    }
}
