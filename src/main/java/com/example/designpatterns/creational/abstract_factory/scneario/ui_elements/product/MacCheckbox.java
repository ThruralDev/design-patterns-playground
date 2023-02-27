package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product;

public class MacCheckbox implements Checkbox {

    @Override
    public void setCheckboxLabel() {

        System.out.println("Setting checkbox label for Mac.");
    }

    @Override
    public void paintCheckbox() {

        System.out.println("Painting Checkbox for Mac.");
    }
}
