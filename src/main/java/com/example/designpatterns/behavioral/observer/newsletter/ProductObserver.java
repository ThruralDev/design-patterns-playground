package com.example.designpatterns.behavioral.observer.newsletter;

public class ProductObserver implements Observer{

    @Override
    public void update() {
        System.out.println("Observer got mail: Product has changed! Now you can get to the store and buy it!");
    }
}
