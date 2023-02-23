package com.example.designpatterns.creational.factory.scenario.abstracto.creator;

import com.example.designpatterns.creational.factory.scenario.abstracto.product.Product;
import com.example.designpatterns.creational.factory.scenario.abstracto.product.ProductB;

public class CreatorB extends Creator{

    @Override
    public Product createProduct() {

        return new ProductB();
    }
}
