package com.example.designpatterns.behavioral.state.quadrocopter.state;

import com.example.designpatterns.behavioral.state.quadrocopter.State;

public class FlightState implements State {

    @Override
    public void takeOff() {
        if(Quadrocopter.hasPower()){
            System.out.println("Goooing higher!");
            Quadrocopter.decreasingPower();
        }else {
            Quadrocopter.changeState(new BatteryLowState());
        }
    }
}
