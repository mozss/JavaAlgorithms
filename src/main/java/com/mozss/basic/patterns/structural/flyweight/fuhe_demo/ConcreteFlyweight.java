package com.mozss.basic.patterns.structural.flyweight.fuhe_demo;

/**
 * @author mozss
 * @create 2019-10-29 20:40
 */

public class ConcreteFlyweight extends Flyweight {
    private Character intrinsicState = null;
    /*
     * 构造函数
     * */

    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }

    /*
     * 外蕴状态作为参量传入方法中
     * */
    @Override
    public void operation(String state) {
        System.out.println("INternal state = " + intrinsicState + "Extrinsic state = " + state);
    }
}
