package com.mozss.patterns.creational.factory.abstract_factory.demo_01;

/**
 * @author mozss
 * @create 2019-09-08 15:35
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle执行画画动作");
    }

    @Override
    public void erase() {
        System.out.println("Circle执行擦去动作");
    }
}
