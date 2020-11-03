package com.mozss.patterns.structural.flyweight.dancun_demo;

/**
 * @author mozss
 * @create 2019-10-29 17:40
 */

public class ConcreteFlyweight extends Flyweight {
    private Character intrinsicState = null;
    /*
     * 构造函数，内蕴状态作为参数传入
     * */

    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }

    /*
     * 外蕴状态作为参数传入方法内，改变方法的行为
     * 但是并不改变对象的内蕴状态
     * */
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic state = " + intrinsicState + ",Extrinsic state = " + state);
    }
}
