package com.example.designpatterns.structural.adapter.scenario.example;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(int radius) {

        super(radius);
    }

    public SquarePegAdapter(SquarePeg peg) {

        super(peg.getWidth());
        this.peg = peg;
    }

    public int getRadius() {

        return (int) (peg.getWidth() * Math.sqrt(2)/2);
    }
}
