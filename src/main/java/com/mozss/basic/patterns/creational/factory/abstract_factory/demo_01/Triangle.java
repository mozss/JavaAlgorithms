package com.mozss.basic.patterns.creational.factory.abstract_factory.demo_01;

/**
 * @author mozss
 * @create 2019-09-08 15:35
 */

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle执行画画动作");
    }

    @Override
    public void erase() {
        System.out.println("Triangle执行擦动作");
    }
}
