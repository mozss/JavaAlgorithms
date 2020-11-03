package com.mozss.patterns.creational.factory.factory_method.gardener_demo;

/**
 * @author mozss
 * @create 2019-10-30 11:31
 */

public class Strawberry implements Fruit {
    @Override
    public void grow() {
        System.out.println("Strawberry is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Strawberry has been harvested");
    }

    @Override
    public void plant() {
        System.out.println("Strawberry has been planted");
    }
}
