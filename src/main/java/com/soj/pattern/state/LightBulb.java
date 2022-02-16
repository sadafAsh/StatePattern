package com.soj.pattern.state;

import java.util.HashMap;
import java.util.Map;

public class LightBulb {

    private Map<State,State> lightBulbStateMap=new HashMap<>();
    State currentState;

    public LightBulb(){
        State onState=new OnState(this);
        State offState=new OffState(this);

      this.  lightBulbStateMap.put(offState,onState);
      this.  lightBulbStateMap.put(onState,offState);
        currentState=offState;

    }

    public void setCurrentState(State state) {
        this.currentState=state;
    }
    public String  displayState(){
       return currentState.displayState();
    }
    public void   toggle(){
        this.currentState.transition(lightBulbStateMap.get(currentState));
    }
}
