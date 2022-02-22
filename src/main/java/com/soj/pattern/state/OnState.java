package com.soj.pattern.state;


public class OnState implements State {
    LightBulb bulb;

    public OnState(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void transition(State nextState) {
        bulb.setCurrentState(nextState);
    }

    @Override
    public String displayState() {
return "Light bulb is turned on.";
    }
}
