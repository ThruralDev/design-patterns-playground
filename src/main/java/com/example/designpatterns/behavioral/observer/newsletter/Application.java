package com.example.designpatterns.behavioral.observer.newsletter;

public class Application {

    public static void main(String[] args) {
        EventManager superCoolStore = new EventManager("product", "store");
        superCoolStore.subscribe("product", new ProductObserver());
        superCoolStore.notify("product");
        superCoolStore.subscribe("store", new StoreObserver());
        superCoolStore.notify("store");
        superCoolStore.subscribe("store", new StoreObserver());
        superCoolStore.notify("store");
    }
}
