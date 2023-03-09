package com.example.designpatterns.structural.facade.scenario.icecreamStore.complex;

public class Waffle {

    public static String getWaffle(WaffleType waffleType) {

        return "Waffle of type " + waffleType.toString().toLowerCase();
    }
}
