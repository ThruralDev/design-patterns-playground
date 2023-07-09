package com.example.designpatterns.behavioral.state.quadrocopter;

import com.example.designpatterns.behavioral.state.quadrocopter.state.Quadrocopter;

public class Application {

    public static void main(String[] args) {

        Quadrocopter superCoolDrone = new Quadrocopter();
        superCoolDrone.pressJoystickUp();
        superCoolDrone.pressJoystickUp();
        superCoolDrone.pressJoystickUp();
        superCoolDrone.pressJoystickUp();
        superCoolDrone.pressJoystickUp();
        superCoolDrone.pressJoystickUp();
    }
}
