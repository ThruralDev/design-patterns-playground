package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.creator;

import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Button;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.product.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
