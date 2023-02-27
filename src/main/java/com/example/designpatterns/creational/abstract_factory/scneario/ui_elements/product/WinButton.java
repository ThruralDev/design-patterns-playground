package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product;

public class WinButton implements Button {

    @Override
    public void createButtonText() {

        System.out.println("Creating Text for Windows Button.");
    }

    @Override
    public void paintButton() {

        System.out.println("Painting Windows Button.");
    }

    @Override
    public void setButtonPosition() {

        System.out.println("Setting Position for Windows Button.");
    }
}
