package com.example.designpatterns.structural.facade.scenario.icecreamStore;

import com.example.designpatterns.structural.facade.scenario.icecreamStore.facade.IceCreamSellerFacade;

public class Demo {

    public static void main(String[] args) {

        IceCreamSellerFacade iceCreamSellerFacade = new IceCreamSellerFacade();
        System.out.println("Ordering most popular ice on the store...");
        System.out.println("...");
        iceCreamSellerFacade.orderMostPopularIce();
        System.out.println("Tadaaaa");
    }
}
