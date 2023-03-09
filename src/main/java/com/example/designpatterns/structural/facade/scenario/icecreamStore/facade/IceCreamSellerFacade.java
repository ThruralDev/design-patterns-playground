package com.example.designpatterns.structural.facade.scenario.icecreamStore.facade;

import com.example.designpatterns.structural.facade.scenario.icecreamStore.complex.*;

public class IceCreamSellerFacade {

    public void orderMostPopularIce(){

        System.out.println(Waffle.getWaffle(WaffleType.HONEY));
        System.out.println(IceCream.getIceCream(IceCreamSort.CHOCOLATE));
        System.out.println(IceCream.getIceCream(IceCreamSort.BERRY));
        System.out.println(Additional.getAdditional(AdditionalType.SMARTIES));
    }
}
