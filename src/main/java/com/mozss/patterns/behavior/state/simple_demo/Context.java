package com.mozss.patterns.behavior.state.simple_demo;

/**
 * @author mozss
 * @create 2019-10-27 10:49
 */

public class Context {
    private State state;

    public void sampleOperation() {
        state.sampleOpretion();
    }

    public void setState(State state) {
        this.state = state;
    }
}
