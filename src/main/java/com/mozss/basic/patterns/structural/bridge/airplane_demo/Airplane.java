package com.mozss.basic.patterns.structural.bridge.airplane_demo;

/**
 * @author mozss
 * @create 2019-10-29 11:37
 */

abstract public class Airplane {
    abstract public void fly();

    protected AirplaneMaker airplaneMaker;
}
