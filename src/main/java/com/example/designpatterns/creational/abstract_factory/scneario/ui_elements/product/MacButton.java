package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product;

public class MacButton implements Button {

    @Override
    public void createButtonText() {

        System.out.println("Creating Text for Mac Button.");
    }

    @Override
    public void paintButton() {

        System.out.println("Painting Mac Button.");
    }

    @Override
    public void setButtonPosition() {

        System.out.println("Setting Position for Mac Button.");
    }
}
