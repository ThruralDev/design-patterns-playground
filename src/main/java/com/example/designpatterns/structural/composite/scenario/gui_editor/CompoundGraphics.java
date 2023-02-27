package com.example.designpatterns.structural.composite.scenario.gui_editor;

import java.util.LinkedList;
import java.util.List;

public class CompoundGraphics implements Graphics{

    private List<Graphics> graphicsList = new LinkedList<Graphics>();

    void add(Graphics child) {
        graphicsList.add(child);
    }

    void remove(Graphics child) {
        graphicsList.remove(child);
    }

    @Override
    public void move(int x, int y) {
        graphicsList.forEach(graphic -> {
            graphic.move(x, y);
        });
    }

    @Override
    public void draw() {

        graphicsList.forEach(Graphics::draw);
    }
}
