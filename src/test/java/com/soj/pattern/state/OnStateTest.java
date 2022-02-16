package com.soj.pattern.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnStateTest {

    @Test
    void transition() {
        LightBulb bulb=new LightBulb();
        OnState onState=new OnState(bulb);
        onState.transition(onState);
        Assertions.assertTrue(onState instanceof State);

    }

    @Test
    void displayState() {
        LightBulb bulb=new LightBulb();
        OnState onState=new OnState(bulb);
       String result= "Light bulb is turned on.";
       String actual=onState.displayState();
        Assertions.assertEquals(result,actual);
    }


//    @Override
//    public void transition(State nextState) {
//        bulb.setCurrentState(nextState);

}