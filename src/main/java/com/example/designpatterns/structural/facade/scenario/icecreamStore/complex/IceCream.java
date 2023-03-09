package com.example.designpatterns.structural.facade.scenario.icecreamStore.complex;

public class IceCream {

    public static String getIceCream(IceCreamSort iceCreamSorts){

        return "Putting ice cream of type " + iceCreamSorts.toString().toLowerCase() + " into the waffle";
    }
}
