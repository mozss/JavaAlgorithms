package com.mozss.patterns.behavior.strategy.demo;

/**
 * @author mozss
 * @create 2019-10-15 20:13
 */

public class Context {
    private Strategy strategy;

    /*
     * 策略方法
     * */
    public void contextInterface() {
        strategy.strategyInterface();
    }
}
