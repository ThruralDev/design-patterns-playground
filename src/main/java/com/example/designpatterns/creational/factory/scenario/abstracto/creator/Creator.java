package com.example.designpatterns.creational.factory.scenario.abstracto.creator;

import com.example.designpatterns.creational.factory.scenario.abstracto.product.Product;

public abstract class Creator {

    public static Creator getCreator(Creator creator){
        if(creator instanceof CreatorA || creator instanceof CreatorB){
            return creator;
        }
        else{
            return new CreatorA();
        }
    }

    public abstract Product createProduct();
}
