package com.example.designpatterns.structural.composite.scenario.gui_editor;

public class Dot implements Graphics{

    private int x = 0;
    private int y = 0;

    public Dot(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {

        System.out.println(String.format("Moving dot by %s in x and %s in y.", x, y));
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {

        System.out.println(String.format("Drawing dot at %s in x and %s in y.", x, y));
    }
}
