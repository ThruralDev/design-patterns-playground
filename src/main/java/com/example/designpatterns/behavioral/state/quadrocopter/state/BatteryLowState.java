package com.example.designpatterns.behavioral.state.quadrocopter.state;

import com.example.designpatterns.behavioral.state.quadrocopter.State;

public class BatteryLowState implements State {

    @Override
    public void takeOff() {
        System.out.println("Charge my battery before doing this action!");
    }
}
