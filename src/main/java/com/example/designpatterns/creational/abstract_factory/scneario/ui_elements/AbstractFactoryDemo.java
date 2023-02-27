package com.example.designpatterns.creational.abstract_factory.scneario.ui_elements;

import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.creator.GUIFactory;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.creator.MacFactory;
import com.example.designpatterns.creational.abstract_factory.scneario.ui_elements.creator.WinFactory;

public class AbstractFactoryDemo {

    private static Application configureApplication() {

        Application app;
        GUIFactory guiFactory;
        String osName = "win";

        if (osName.contains("mac")) {
            guiFactory = new MacFactory();
        } else {
            guiFactory = new WinFactory();
        }

        return new Application(guiFactory);
    }

    public static void main(String[] args) {

        Application application = configureApplication();
        application.paint();
        application.setText();
    }
}
