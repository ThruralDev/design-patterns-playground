package com.example.designpatterns.behavioral.composite.scenario.gui_editor;

public class Circle extends Dot{

    private int radius;
    private int x = 0;
    private int y = 0;

    public Circle(int x, int y) {

        super(x, y);
    }

    public Circle(int radius, int x, int y) {

        super(x,y);

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {

        System.out.println(String.format("Moving circle by %s in x and %s in y.", x, y));
    }

    @Override
    public void draw() {

        System.out.println(String.format("Drawing circle with radius %s at %s in x and %s in y.", radius, x, y));
    }
}
