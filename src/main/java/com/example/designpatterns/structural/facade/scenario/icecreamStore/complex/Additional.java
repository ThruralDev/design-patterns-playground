package com.example.designpatterns.structural.facade.scenario.icecreamStore.complex;

public class Additional {

    public static String getAdditional(AdditionalType additionalType){
        return "Get additional of type " + additionalType.toString().toLowerCase();
    }
}
