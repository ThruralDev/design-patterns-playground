package com.example.designpatterns.structural.adapter.scenario.example;

public class Client {

    public Client() {

    }

    void clientMethod() {

        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        System.out.println("Checking if small peg fits in hole.. " + hole.fits(peg));

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);

        // This will not compile.
        // hole.fits(small_sqpeg);

        // To fix this:
        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        System.out.println("Checking if small square peg fits in hole.. " + hole.fits(small_sqpeg_adapter));
        System.out.println("Checking if large square peg fits in hole.. " + hole.fits(large_sqpeg_adapter));
    }
}
