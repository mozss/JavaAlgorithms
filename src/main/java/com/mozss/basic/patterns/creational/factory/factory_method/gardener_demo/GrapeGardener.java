package com.mozss.basic.patterns.creational.factory.factory_method.gardener_demo;

/**
 * @author mozss
 * @create 2019-10-30 11:33
 */

public class GrapeGardener implements FruitGardener {
    /*
     * 工厂方法
     * */
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
