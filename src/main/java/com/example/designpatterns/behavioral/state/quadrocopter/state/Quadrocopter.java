package com.example.designpatterns.behavioral.state.quadrocopter.state;

import com.example.designpatterns.behavioral.state.quadrocopter.State;

public class Quadrocopter {

    private static State currentState = new ReadyState();

    private static int power = 3;

    public Quadrocopter() {
    }

    public static void decreasingPower() {
        power--;
    }

    public static boolean hasPower() {
        return power > 0;
    }

    protected static void changeState(State newState){
        currentState = newState;
    }

    public void pressJoystickUp() {

        currentState.takeOff();
    }
}
