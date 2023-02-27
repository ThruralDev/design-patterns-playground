package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.creator;

import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Button;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Checkbox;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.MacButton;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {

        return new MacCheckbox();
    }
}
