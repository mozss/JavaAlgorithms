package com.mozss.patterns.creational.factory.factory_method.gardener_demo;

/**
 * @author mozss
 * @create 2019-10-30 11:29
 */

public class Grape implements Fruit {
    private boolean seedles;

    @Override
    public void grow() {
        System.out.println("Grape is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Grape has been harvested");
    }

    @Override
    public void plant() {
        System.out.println("Grape has been planted");
    }

    public void setSeedles(boolean seedles) {
        this.seedles = seedles;
    }

    public boolean isSeedles() {
        return seedles;
    }
}
