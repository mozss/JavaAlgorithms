package com.mozss.patterns.creational.factory.factory_method.demo;

/**
 * @author mozss
 * @create 2019-09-08 19:54
 */

public class ConcreteCreator1 implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
