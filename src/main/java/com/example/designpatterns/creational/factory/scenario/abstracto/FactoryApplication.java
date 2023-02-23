package com.example.designpatterns.creational.factory.scenario.abstracto;

import com.example.designpatterns.creational.factory.scenario.abstracto.creator.Creator;
import com.example.designpatterns.creational.factory.scenario.abstracto.creator.CreatorA;
import com.example.designpatterns.creational.factory.scenario.abstracto.creator.CreatorB;
import com.example.designpatterns.creational.factory.scenario.abstracto.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {

        SpringApplication.run(FactoryApplication.class, args);

        Creator creator = Creator.getCreator(new CreatorA());
        Product p1 = creator.createProduct();
        p1.doStuff();

        creator = Creator.getCreator(new CreatorB());
        Product p2 = creator.createProduct();
        p2.doStuff();
    }
}
