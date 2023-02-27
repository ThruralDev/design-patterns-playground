package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements;

import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.creator.GUIFactory;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Button;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Checkbox;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {

        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {

        button.paintButton();
        checkbox.paintCheckbox();
    }

    public void setText() {

        button.createButtonText();
        checkbox.setCheckboxLabel();
    }
}
