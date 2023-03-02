package com.example.designpatterns.structural.adapter.scenario.example;

public class RoundHole {

    private int radius;

    public RoundHole(int radius) {

        this.radius = radius;
    }

    public int getRadius() {

        return radius;
    }

    boolean fits(RoundPeg peg){

        return this.getRadius() >= peg.getRadius();
    }
}
