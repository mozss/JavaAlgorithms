package com.mozss.patterns.behavior.observe.demo;

/**
 * @author mozss
 * @create 2019-10-28 14:46
 */

public class ConcreteObserver implements Observer {
    /*
     * 调用这个方法更新自己
     * */
    public void update() {
        System.out.println("I am notified");
    }
}
