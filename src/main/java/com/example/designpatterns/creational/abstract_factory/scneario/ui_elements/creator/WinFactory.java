package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.creator;

import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Button;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Checkbox;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.WinButton;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.WinCheckbox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {

        return new WinCheckbox();
    }
}
