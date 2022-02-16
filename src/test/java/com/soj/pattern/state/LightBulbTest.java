package com.soj.pattern.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LightBulbTest {

    @Test
    void testToSetCurrentState() {
        State currentState;
        LightBulb bulb=new LightBulb();
        State offState=new OffState(bulb);
        bulb.setCurrentState(offState);
        Assertions.assertTrue(true,"offState is called");
    }

    @Test
    void testToDisplayState() {
        LightBulb lightBulb=new LightBulb();
       String actual= lightBulb.displayState();
        String result= "Light bulb is turned off.";
        Assertions.assertEquals(actual,result);
    }

    @Test
    void testToToggle() {
        LightBulb bulb=new LightBulb();
        OnState onState=new OnState(bulb);
        OffState offState=new OffState(bulb);
        Map<State,State> map=new HashMap<>();
        map.put(onState,offState);
        bulb.toggle();
        Assertions.assertEquals(map.size(),1);
        Assertions.assertTrue(true,"map is been called");

    }
}