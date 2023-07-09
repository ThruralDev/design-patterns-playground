package com.example.designpatterns.behavioral.state.quadrocopter.state;

import com.example.designpatterns.behavioral.state.quadrocopter.State;

public class ReadyState implements State {

    @Override
    public void takeOff() {
        if(Quadrocopter.hasPower()){
            System.out.println("Ready to take off! Going higher!");
            Quadrocopter.decreasingPower();
            Quadrocopter.changeState(new FlightState());
        }else {
           Quadrocopter.changeState(new BatteryLowState());
        }
    }
}
