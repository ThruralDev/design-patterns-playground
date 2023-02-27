package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product;

public class WinCheckbox implements Checkbox {

    @Override
    public void setCheckboxLabel() {

        System.out.println("Setting checkbox label for Windows.");
    }

    @Override
    public void paintCheckbox() {

        System.out.println("Painting Checkbox for Windows.");
    }
}
