package com.example.designpatterns.structural.composite.scenario.gui_editor;

import java.util.LinkedList;
import java.util.List;

public class Application {

    private static final ImageEditor imageEditor = new ImageEditor();

    public static void main(String[] args) {

        imageEditor.load();
        imageEditor.addComposite(new LinkedList<>(){{add(new Dot(0, 0));}});
        imageEditor.drawingGraphics();
        System.out.println("Appending new composite.");
        List<Graphics> composite = new LinkedList<>();
        composite.add(new Dot(10, 10));
        composite.add(new Circle(20, 10, 10));
        imageEditor.addComposite(composite);
        imageEditor.drawingGraphics();
    }
}
