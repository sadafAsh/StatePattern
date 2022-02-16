package com.soj.pattern.state;

public interface State {
    public void transition(State state);
  public   String displayState();
}
