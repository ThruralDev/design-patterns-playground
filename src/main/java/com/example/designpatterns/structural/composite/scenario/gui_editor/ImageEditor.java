package com.example.designpatterns.structural.composite.scenario.gui_editor;

import java.util.List;

public class ImageEditor {

    CompoundGraphics compoundGraphics;

    void load(){
        compoundGraphics = new CompoundGraphics();
    }

    void drawingGraphics(){

        compoundGraphics.draw();
    }

    void addComposite(List<Graphics> components) {

        CompoundGraphics group = new CompoundGraphics();
        components.forEach(component -> {
            group.add(component);
            compoundGraphics.remove(group);
        });
        compoundGraphics.add(group);
    }
}
