package com.soj.pattern.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OffStateTest {



    @Test
    void displayState() {

        LightBulb bulb=new LightBulb();
        OffState offState=new OffState(bulb);
       String result= "Light bulb is turned off.";
       String actual=offState.displayState();
        Assertions.assertEquals(result,actual);
    }
}